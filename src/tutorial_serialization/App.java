/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial_serialization;

/**
 *
 * @author Jonathan Hinkel
 */
public class App {
    public static void main(String[] args) {
        //CarManager.list.add(new Cars(123456, "BMW", new Driver("Jonathan Hinkel", 123123968))); 
        //CarManager.SaveList();
        CarManager.LoadList();
        for(Cars car : CarManager.list) {
            System.out.println(car);
        }
    }
}
