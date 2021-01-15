package simpleFactoryPattern;

import factoryMethod.Car;
import factoryMethod.Plane;
import factoryMethod.Vehicle;

public class VehicleFactory {
    public Vehicle create(){
        return new Car();
    }
    public Vehicle createPlane(){
        return new Plane();
    }
}
