/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.java;

/**
 *
 * @author kirit
 */
public class Ejemplo {
    package example;

public class Num
{
    public static void main(String [] args) 
    {
    String s = "42";
        try 
        {
            s = s.concat(".5"); 
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x = (int) Math.ceil(Double.valueOf(s).doubleValue()); //Line 14
            System.out.println(x);
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Wrong Number");
        }
    }
}
    
}
