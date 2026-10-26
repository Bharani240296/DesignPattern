package factoryPattern;

public class VehicleFactory {
//Definition: Creates objects without exposing the object creation logic to the client.
    static Vehicle driveVehicle(String type){
        if ("Bike".equalsIgnoreCase(type)){
            return new Bike();
        }
        else if ("car".equalsIgnoreCase(type)){
            return new Car();
        }
        return null;
    }
}
