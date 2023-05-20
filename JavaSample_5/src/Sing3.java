public class Sing3 {
    private static Sing3 inst = new Sing3();
    private Sing3() {}
    public static Sing3 getInstance() {
        if (inst == null) {
            synchronized (Sing3.class) {
                if(inst == null) {
                    inst = new Sing3();
                }
            }
        }
        return inst;
    }
}
