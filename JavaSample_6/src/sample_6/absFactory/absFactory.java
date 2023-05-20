package sample_6.absFactory;

public class absFactory {
    public static void main(String[] args) {
        CarsFactory factory;
        factory = new FordFactory();
        factory.createCoupe();
    }
}

