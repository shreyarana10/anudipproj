package alternate.java;

import java.util.Scanner;

public class alternate {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n;
				int sum=0;
				Scanner s = new Scanner(System.in);
				System.out.print("Enter no. of elements you want in array:");
				n = s.nextInt();
				int a[] = new int[n+1];
				int a1[] = new int[n+1];
				System.out.println("Enter all the elemnts ");
				for(int i = 0; i < n; i++)
				{
				a[i] = s.nextInt();
				}
				System.out.println("You Entered............. ");
				for(int i = 0; i < n; i++) {
					System.out.println(a[i]+ " ");
				}
				System.out.println("Enter the alternate number witht he help of first loop ");
				System.out.println("..............................................");
				for(int i = 0; i < n; i++) {
					a1[i]=a[i]+1;
					//a1[i]=s.nextInt();
		        }
				System.out.println("Your alternate loop is here  ");
				System.out.println("..................................");
				for(int i = 0; i < n; i++) {
					System.out.println(a1[i]+ " ");
				}
				for(int i = 0; i < n; i++) {
					sum+=a1[i];
					//a1[i]=s.nextInt();
		        }
				System.out.println("Sum of elements in that alternate array ...............");
				//for(int i = 0; i < n; i++)
				//{
					System.out.println(sum);
				//}
				System.out.println("Ending.............");
				
				
	}

}
