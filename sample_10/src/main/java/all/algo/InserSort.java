package all.algo;

import inface.SortingAlgo;
import org.springframework.stereotype.Component;

@Component("insert")
public class InserSort implements SortingAlgo {
    @Override
    public void doSort() {
        System.out.println("It's insert sort!");
    }
}
