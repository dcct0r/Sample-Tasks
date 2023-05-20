package all.algo;

import inface.SortingAlgo;
import org.springframework.stereotype.Component;

@Component("merge")
public class MerSort implements SortingAlgo {
    @Override
    public void doSort() {
        System.out.println("It's merge sort!");
    }
}
