package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class t2 {
    static void sum(List<Integer> a) {
        for (int i = 0; i < 1000; i++) {
            a.add(i);
        }
    }
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        List<Integer> nums = new ArrayList<>();
        try{
            semaphore.acquire();
            sum(nums);
            semaphore.release();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
