/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author Dominic
 */
public class Test {

    private static ArrayList<Car> arr = new ArrayList();

    public static void main(String[] args) {
        Car car1 = new Car("ASD0495745");
        Car car2 = new Car("FDS293874", "Mercedes", 360, "Silver");

        car1.setColor("Green");
        car1.setHp(410);
//        System.out.println("Car 1 has this color: " + car1.getColor());
//        System.out.println("Car has this much horse power: " + car1.getHp());

        car2.setColor("Red");
//        System.out.println("Car 2 has this color: " + car2.getColor());

        arr.add(car1);
        arr.add(car2);
        
        Car certainCar = getCertainCar("ASD0495745");
        System.out.println("Certain car has the color: " + certainCar.getColor());
    }

    public static Car getCertainCar(String serialNumber) {
        for (Car c : arr) {
            if (c.getSerialNumber() == serialNumber) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Car> CarWithAtLeastXHP(int minHp) {
        ArrayList<Car> cars = new ArrayList();
        for (Car c : arr) {
            if (c.getHp() >= minHp) cars.add(c);
        }
        return cars;
    }
}
