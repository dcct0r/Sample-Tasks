import java.util.Comparator;

//8) Имплементировать интерфейс Comparator, сравнивающий
//два массива с одинаковыми типами элементов по количеству элементов в данных
//массивах.
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        Integer[] arr2 = {2, 3, 3, 5};

        Comparator<Integer[]> a = new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] i, Integer[] t1) {
                if(i.length > t1.length) return 1;
                else if (i.length < t1.length) return -1;
                else if (i.length == t1.length) return 0;
                else return -100;
            }
        };
        System.out.println(a.compare(arr, arr2));
    }
}