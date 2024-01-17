import com.workintech.cars.*;

public class Main {
    public static void main(String[] args) {
        Car mitsubishi = new Mitsubishi(4, "Mitsubishi Outlander");
        Car holden = new Holden(6, "Holden Commodore");
        Car ford = new Ford(8, "Ford Mustang");

        System.out.println(mitsubishi);
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        System.out.println("***************");

        System.out.println(holden);
        holden.startEngine();
        holden.accelerate();
        holden.brake();

        System.out.println("***************");

        System.out.println(ford);
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        System.out.println("***************");

        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "This is a gas-powered car", 10.5, 4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "This is an electric car", 200.0, 500);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "This is a hybrid car", 15.0, 300, 4);

        System.out.println("***************");

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        car.startEngine();
        car.drive();
        System.out.println("Type of the car: " + car.getClass().getSimpleName());
        System.out.println();
    }





}