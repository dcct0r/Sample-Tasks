public class Sing1 {
    private static final Sing1 instance = new Sing1();
    private Sing1() {}

    public static Sing1 getInstance() {
        return instance;
    }
}
