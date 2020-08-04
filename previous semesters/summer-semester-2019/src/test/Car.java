/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Car {

    private final String serialNumber;
    private String brand;
    private int hp;
    private String color;

    public Car(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Car(String serialNumber, String brand, int hp, String color) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.hp = hp;
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
