/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.math.BigDecimal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author krusby
 */
public class MyWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //create buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Get choice input
        System.out.print("KG (0) or pounds (1)?: ");
        double choiceInput = tryParseNumInput(br.readLine());
        if (choiceInput < 0 || choiceInput > 1)
            System.exit(1);
            
        //Get number
        System.out.print("Weight in chosen format: ");
        double weightInput = tryParseNumInput(br.readLine());
        if (weightInput <= 0)
            System.exit(1);
        
        double output = 0.0;
        if (choiceInput == 0)
            output = weightInput * 2.2;
        else if (choiceInput == 1)
            output = weightInput / 2.2;
        
        System.out.println("Your weight in the opposite format is " + output);
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
