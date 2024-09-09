package Xenosis_Internship.Assignment3.Q1;

public class Vehicle {

    public void vehicleEngine(){
        System.out.println("Vehicle starts..");
    }
}

class Car extends  Vehicle{
    public void vehicleEngine(){
        System.out.println("Car Engine is  starting...");
    }
}

class Bike extends Vehicle{
    public void vehicleEngine(){
        System.out.println("Bike Engine is starting...");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleEngine();

        Vehicle car = new Car();
        car.vehicleEngine();

        Vehicle bike = new Bike();
        bike.vehicleEngine();
    }
}

