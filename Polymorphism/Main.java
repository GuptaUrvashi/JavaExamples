package com.urvashigupta;
class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }
    public int getCylinder() {
        return cylinder;
    }
    public void startEngine(){
        System.out.println("In Car class, engine is starting..");
    }
    public void accelerate(){
        System.out.println("In Car class, accelerating!");
    }
    public void brake(){
        System.out.println("In Car class, braking... STOP");
    }
}

class Tesla extends Car{
    public Tesla(int cylinder) {
        super(cylinder, "Tesla");
    }

    @Override
    public void startEngine() {
        System.out.println("In Tesla class, Starting engine");
    }

    @Override
    public void accelerate(){
        System.out.println("In Tesla class, accelerating!");
    }

    @Override
    public void brake(){
        System.out.println("In Tesla class, braking... STOP");
    }
}

class Audi extends Car{
    public Audi(int cylinder) {
        super(cylinder, "Audi");
    }

    @Override
    public void startEngine() {
        System.out.println("In Audi class, Starting engine");
    }

    @Override
    public void accelerate(){
        System.out.println("In Audi class, accelerating!");
    }

    @Override
    public void brake(){
        System.out.println("In Audi class, braking... STOP");
    }

}

class Porsche extends Car{
    public Porsche(int cylinder) {
        super(cylinder, "Porsche");
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() +" ,Starting engine");
    }

    @Override
    public void accelerate(){
        System.out.println( getClass().getSimpleName() +" ,accelerating!");
    }

    @Override
    public void brake(){
        System.out.println( getClass().getSimpleName() +" ,braking... STOP");
    }
}

public class Main {
    public static void main (String []args){
        Car car = new Car(8, "Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Tesla tesla = new Tesla(5);
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        Porsche porsche = new Porsche(5);
        porsche.startEngine();
        porsche.accelerate();
        porsche.brake();
    }
}
