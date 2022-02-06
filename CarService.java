public class CarService {
    public void drive () {
        // Object created with interface type/reference, instead of class type/reference.
        // Car merc = new Mercedes();
        // Car audi = new Audi();
        // Car ferr = new Ferrari();
        Car[] cars = {new Mercedes(), new Audi(), new Ferrari()};
        for (Car car: cars){
            car.drive();
        }
    }
}