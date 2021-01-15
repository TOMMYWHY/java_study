package abstractFactory;


public class Main {
    public static void main(String[] args) {
//        Car v = new Car();
//        Vehicle v = new Car();
//        Vehicle v = new VehicleFactory().create();
        AbstractFactory modernFactory = new ModernFactory();
        Vehicle v = modernFactory.createVehicle();
        v.go();
    }
}
