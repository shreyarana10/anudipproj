package duplicatecharacter;
//importing java.util.scanner package...
import java.util.Scanner;
public class DuplicateCharacter {
	//method for finding duplicate..
		public static void Duplicate(String s) { 
			
			//Declaration and initialization......
			//count variable is for counting the duplicate variable.......
			int count=0;
			
			// Nested for loop...
			// 1st for loop to point the current character....
			//and second for loop for compare the current character to remaining characters......
			for(int i=0;i<s.length()-1;i++) {
				for(int j=i+1;j<s.length();j++) {
					
					//for comparison of current character to next character.....
					if(s.charAt(i)==s.charAt(j)) {
						count++;
						System.out.println(s.charAt(j));
						 
						
					}
					
				}
			}
			if(count==0) {
				System.out.println("No duplicate character found");
				
			}
		
		}
		//main method.....
		public static void main(String[] args) {
			//Declaration....
			String s;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			//taking input.....
			s=sc.nextLine();
			
//			calling the duplicate Method.......
			Duplicate(s);

				
				sc.close();
			 
			

		}
		

	}
			
