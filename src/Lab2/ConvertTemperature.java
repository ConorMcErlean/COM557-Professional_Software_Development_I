package Lab2;

import java.text.DecimalFormat;

public class ConvertTemperature {
    public static void main(String[] args) {
        //Initalise formating
        DecimalFormat df = new DecimalFormat("00.00");

        // Declare and initialise Centigrade temp
        double centigrade = 25.65, fahrenheit;

        // Conversion formula
        // farenheit = 9/5 * centigrade + 32
        fahrenheit = (9.0 / 5.0 * centigrade) + 32;

        // Print out
        System.out.println(df.format(centigrade) +" degrees centigrade = "
        + df.format(fahrenheit) + "degrees Fahrenheit");
    }//main
}//class
