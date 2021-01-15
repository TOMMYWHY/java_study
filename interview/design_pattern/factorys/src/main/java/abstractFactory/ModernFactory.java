package abstractFactory;

public class ModernFactory extends AbstractFactory{
    Vehicle createVehicle() {
        return new Car();
    }
}
