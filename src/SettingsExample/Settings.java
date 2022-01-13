/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SettingsExample;

import java.io.Serializable;

/**
 *
 * @author Jonathan Hinkel
 */
public class Settings implements Serializable {
    public String name;
    
    public Settings(String name) {
        this.name = name;
    }
}
