package exception;
//Importing the java.util.scanner package..
import java.util.Scanner;
//Importing package for regex.pattern.....
import java.util.regex.Pattern;

public class InvalidMailMain {
public static void main(String []args) {
		
//		Declaring Mailid.....
		String MailId;
		Scanner sc= new Scanner (System.in);
		boolean flag=true;
		
//this while loop work till the flag is true....
		while(flag) {
			System.out.println("Enter Mail Id");

			//taking input from user...
			MailId=sc.nextLine();
			
			//Try and catch block for Exception Handling....
			try {
				
				//this if block check weather the string consist @ and . or not and check if string is valid or not...
				if(!Pattern.matches("\\w*\\d*[@]\\w*[.]\\w*", MailId)) {
					
					//if it not matches the pattern then it throw an Exception InvalidMailIdException....
					throw new invalidMailException("Invalid Email");
				}
				else {
					
//					if it matches the pattern then flag will turn into false....
					flag=false;
					System.out.println("Valid mail id");
					
				}
				
			}catch(invalidMailException ime){
				System.out.println(ime.getMessage());
				
			}
			
			finally {
				sc.close();
			}
		}
		
	}
}

