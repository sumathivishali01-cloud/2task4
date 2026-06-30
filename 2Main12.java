public class Main12 {

    public static void main(String[] args) {

        // Method Overloading
        Calculator calculator = new Calculator();

        System.out.println("Addition of two integers: " + calculator.add(10, 20));

        System.out.println("Addition of three integers: " + calculator.add(10, 20, 30));

        System.out.println("Addition of two doubles: " + calculator.add(10.5, 20.5));

        System.out.println();

        // Method Overriding
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        Car car = new Car();
        car.startEngine();
    }
}