//8) Фильтрация по возрасту больше чем 20, сортировка по последней
//букве имени, увеличение возраста каждого на 3, вычисление среднего
//возраста всех элементов.

import java.util.ArrayList;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(0, new Human("Robert", "A", 10, 2000, 40));
        humans.add(0, new Human("Mary", "B", 23, 1987, 45));
        humans.add(0, new Human("Andrew", "C", 54, 1966, 98));
        humans.add(0, new Human("Garry", "D", 19, 1991, 60));
        humans.add(0, new Human("Stella", "E", 6, 2004, 30));

        humans.stream().filter(Human -> Human.getAge() > 20)
                .forEach(System.out::println);
        System.out.println();
        humans.stream().sorted(Comparator.comparing(Human::getLastLetter)).forEach(System.out::println);
        Integer s = humans.stream().map(x -> x.getAge()).reduce(0, Integer::sum);

        System.out.println("\nAverage age: " + s / 5 + "\n");

        humans.stream().map(p -> p.getFirstName() + " " + p.getLastName() + " " +
                (p.getAge() + 3) + " " + p.getBirthDate() + " "
        + p.getWeight()).forEach(System.out::println);

    }
}