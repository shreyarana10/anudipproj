package labtestt;

import java.util.Scanner;

public class Greatestnum {//initiallisation
	private static Scanner sc;
	public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter three numbers: ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();//putting value a
	b = sc.nextInt();//putting value b
	c = sc.nextInt();//putting value c
	if(a > b && a > c)
	System.out.println("The largest among the three numbers is " + a);
	else if(b > a && b > c)
	System.out.println("The largest among the three numbers is " + b);
	else
	System.out.println("The largest among the three numbers is " + c);
	}
}
