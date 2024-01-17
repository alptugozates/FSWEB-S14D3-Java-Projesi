package com.workintech.cars;

public class CarSkeleton {
    String name;
    private String description;

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Default engine start for " + name);
    }

    public void drive() {
        System.out.println("Default drive for " + name);
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Default engine running for " + name);
    }
}
