package sample_6.absFactory;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new  FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}

