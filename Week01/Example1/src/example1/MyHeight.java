/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author krusby
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) throws IOException {
        //create buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 
        //Get number
        System.out.print("Height in cm: ");
        double heightInput = tryParseNumInput(br.readLine());
        if (heightInput <= 0)
            System.exit(1);
        
        double totalInches = heightInput / 2.54; 
        double feet = totalInches / 12;
        double inches = totalInches % 12;
        
        System.out.println("Your height in the format is:");
        System.out.println("Total inches: " + totalInches);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
        System.exit(0);
    }
    
    public static Double tryParseNumInput(String value){
        try{
             Double.parseDouble(value);
             return Double.parseDouble(value);
        }
        catch(NumberFormatException e){
            return -1.0;
        }
    }   
}
