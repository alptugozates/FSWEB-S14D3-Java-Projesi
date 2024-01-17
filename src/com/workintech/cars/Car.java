package com.workintech.cars;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;

        if (cylinders != car.cylinders) return false;
        return name.equals(car.name);
    }
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + "'s engine is starting.");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating.");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + " is braking.");
    }
}
