
public class Main {
    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ready");
        });
        executorService.execute(() -> System.out.println("...in process"));
        executorService.shutdown();
    }
}