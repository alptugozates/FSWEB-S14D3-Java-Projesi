import com.workintech.cars.Car;
import com.workintech.cars.Ford;
import com.workintech.cars.Holden;
import com.workintech.cars.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car mitsubishi = new Mitsubishi(4, "Mitsubishi Outlander");
        Car holden = new Holden(6, "Holden Commodore");
        Car ford = new Ford(8, "Ford Mustang");

        System.out.println(mitsubishi);
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        System.out.println();

        System.out.println(holden);
        holden.startEngine();
        holden.accelerate();
        holden.brake();

        System.out.println();

        System.out.println(ford);
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}