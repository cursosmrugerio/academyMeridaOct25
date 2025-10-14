package com.simu.v4;
@FunctionalInterface
interface Vehicle {
    void drive();
}
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving car");
    }
}
public class Main {
    static int contador;
    public static void startJourney(Vehicle v) {
        v.drive();
        contador++;
    }
    public static void main(String[] args) {
        Car myCar = new Car(); //IS-A Vehicle

        // ❌ Bad: Creating unnecessary WRAPPER
        Vehicle v1 = () -> myCar.drive();
        startJourney(v1); //1

        // ⚠️ Still unnecessary
        Vehicle v2 = myCar::drive;
        startJourney(v2); //2

        // ✅ Good: Direct polymorphism
        startJourney(myCar);  // Car IS-A Vehicle! //3
        System.out.println("contador: " + contador);
    }
}