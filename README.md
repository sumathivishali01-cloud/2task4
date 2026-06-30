# 2task4
public class Calculator {

    // Method Overloading - Two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method Overloading - Three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method Overloading - Two double values
    public double add(double a, double b) {
        return a + b;
    }
}
public class Vehicle {

    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }
}
public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a push button.");
    }
}
