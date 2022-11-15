package operadores;
import java.util.Scanner;
public class DegreetoFahrenheitconverter{    
	    public static void main (String[] args){
	    	System.out.println("Enter a temperature in Celsius: ");
	    	Scanner scanCelsius = new Scanner(System.in);
	    	double Celsius= scanCelsius. nextDouble();
	    	double Fahrenheit = 0;
	    	Fahrenheit = (Celsius * 1.8) + 32 ;
	    	System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
}
}