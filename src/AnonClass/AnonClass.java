/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnonClass;

/**
 *
 * @author Jonathan Hinkel
 */
public class AnonClass {
    public int id; 
    public String value; 
    
    public AnonClass(String value) {
        this.value = value; 
    }
        
    @Override
    public String toString() {
        return "AnonClass => " + this.value; 
    }
    
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof AnonClass)) return false;
        else return 
    }
    
}
