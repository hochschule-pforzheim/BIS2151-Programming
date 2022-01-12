/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_serialization;

import java.io.Serializable;

/**
 *
 * @author Jonathan Hinkel
 */
public class Cars implements Serializable {
    private int license;
    private String manufacturer; 
    private transient Driver driver; 

    public Cars(int license, String manufacturer, Driver driver) {
        this.license = license;
        this.manufacturer = manufacturer;
        this.driver = driver;
    }

    public int getLicesnse() {
        return license;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    @Override
    public String toString() {
        return this.driver + ": " + this.license + " => " + this.driver; 
    }
}
