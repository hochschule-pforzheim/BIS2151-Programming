/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiExampleLogic;

/**
 *
 * @author Jonathan Hinkel
 */
public class ClickCounter 
{
    private static int clickCounter = 0; 
    
    public static int incrementClickCounter()
    {
        clickCounter++; 
        return clickCounter; 
    }
    
    public boolean checkString(String s)
    {
        return s.chars().allMatch(Character:: isLetter); 
    }
    
}
