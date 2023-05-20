package sample_7.decor;

//для добавления новых возможностей без привязки к его структуре
interface Car {
    void draw();
}
class SportCar implements Car {
    public void draw() {
        System.out.println("SportCar");
    }
}
class UnknownCar implements Car {
    public void draw() {
        System.out.println("UnknownCar");
    }
}
abstract class CarDecorator implements Car {
    protected Car decorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }
    public void draw(){
        decorated.draw();
    }
}
class BlueCarDecorator extends CarDecorator {
    public BlueCarDecorator(Car decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: red");
    }
}

public class dec {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueUnknownCar.draw();
    }
}
