package factoryMethod;

import simpleFactoryPattern.VehicleFactory;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        Vehicle v = new Car();
        Vehicle v = new VehicleFactory().create();
        v.go();
    }
}
