package factoryPattern;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Going a trip driving a car");
    }
}
