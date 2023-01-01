package replace;
//Importing java.util.scanner...
import java.util.Scanner;

public class Replace {
	//replace method for replacing the all character of string to X except last 4 character...... 
	static String replace(String input) {
		  return input.replaceAll(".(?=.{4})", "X");
		}
	
	public static void main(String Args[]) {
		//Declaration....
		 String str ;
		 
		 //taking input from user.....
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String");
	     str=sc.nextLine();
	  
	     //Printing and calling replace method.....
	     System.out.println(replace(str));
	     
	     sc.close();
			
			
	}

	}

