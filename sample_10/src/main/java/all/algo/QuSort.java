package all.algo;

import inface.SortingAlgo;
import org.springframework.stereotype.Component;

@Component("quick")
public class QuSort implements SortingAlgo {
    @Override
    public void doSort() {
        System.out.println("It's quick sort!");
    }
}
