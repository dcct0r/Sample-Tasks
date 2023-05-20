public class Sing2 {
    private Sing2 instance;
    public synchronized Sing2 getInstance() {
        if(instance == null) {
            instance = new Sing2();
            return instance;
        }
        return instance;
    }
}
