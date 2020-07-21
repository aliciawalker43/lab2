package lab2;
import java.util.Scanner;

public class areaPerimeter {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		double lenght;
		double width;
		Boolean yesNo = true;
		Boolean keepGoing;
		
		while (yesNo == true) {
		
		System.out.println( "What is the length of the classroom?");
		lenght = scnr.nextInt();
		 
		 System.out.println( "What is the width of the classroom?");
		 width = scnr.nextInt();
		 
		 System.out.print( " The classroom area is " + (lenght * width));
		 System.out.print( " The perimeter of the class room is " + (lenght + lenght + width + width ));
	
	     System.out.println (" Would you like to keep measuring rooms (y/n)?");
	    
	      yesNo = scnr.next().startsWith("y");
	     
	  
		   
	   }
	}
}
