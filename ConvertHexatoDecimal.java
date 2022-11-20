package villanuevapackage;
import java.util.*;

public class ConvertHexatoDecimal {

	public static void main(String[] args) {
		//Ask user to enter an Hexadecimal number in Console
		System.out.print("Please enter Hexadecimal number: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String hexadecimal = scanner.next();
		
		//Converting Hexadecimal number to Decimal Java
		int decimal = Integer.parseInt(hexadecimal, 16);
		
		
		System.out.println("Converted Decimal number is: " + decimal);
		
		//Converting Hexadecimal number to binary Java 
		
		String binary = Integer.toBinaryString(decimal);
		System.out.printf("Hexadecimal to Binary conversion of %s is: %s %n", hexadecimal, binary);
		
		//Converting Hexadecimal String to Octal in Java
		
		String octal = Integer.toOctalString(decimal);
		System.out.printf("Hexadecimal to Octal conversion of %s is: %s %n", hexadecimal, octal);
			
	}

}
