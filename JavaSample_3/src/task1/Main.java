package task1;

import java.util.HashMap;
import java.util.Map;


//8) List с использованием Semaphore, Map с использованием ключевого
//слова synchronized.

public class Main {
    synchronized static void sum(Map<Integer, Integer> a, int str, int en) {
        for (int i = str; i < en; i++) {
            a.put(i, i * i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> smt = new HashMap<>();
        Thread firstThread = new Thread(() -> {
            sum(smt, 0, 5000);
        });

        Thread secondThread = new Thread(() -> {
            sum(smt, 5000, 10001);
        });
        firstThread.start();
        secondThread.start();
        Thread.sleep(1000);
        for(Map.Entry<Integer, Integer> a : smt.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}