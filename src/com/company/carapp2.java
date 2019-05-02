package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class carapp2 {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();


        Car auto2 = new Car();
        auto2.setColor("green");
        auto2.setMake("Tesla");
        auto2.setYear(2019);
        auto2.setSpeed(85);
        auto2.setModel("spartan");
//        System.out.println(auto2.getColor());
//        System.out.println(auto2.getMake());
//        System.out.println(auto2.getYear());
//        System.out.println(auto2.getSpeed());
//        System.out.println(auto2.getModel());
//        System.out.println("The " + auto2.getColor() + " " + auto2.getMake() + " " + auto2.accel());
//        System.out.println("The " + auto2.getColor() + " " + auto2.getMake() + " " + auto2.showSpeed());
//        System.out.println("The " + auto2.getColor() + " " + auto2.getMake() + " " + auto2.stop());

        cars.add(auto2);

        Car car1 = new Car();
        car1.setColor("yellow");
        car1.setMake("honda");
        car1.setYear(2006);
        car1.setSpeed(55);
        car1.setModel("civic");

        cars.add(car1);

        Car car5 = new Car();
        Scanner entercar = new Scanner(System.in);
        System.out.println("enter the car's make: ");
        String make = entercar.nextLine();
        car5.setMake(make);

        System.out.println("enter car's model: ");
        String model = entercar.nextLine();
        car5.setModel(model);

        System.out.println("enter car's color: ");
        String color = entercar.nextLine();
        car5.setColor(color);

        cars.add(car5);

        for (Car eachcar : cars) {
            System.out.println(eachcar.getDescription());


        }
    }
}
