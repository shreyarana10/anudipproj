package shape;

public class ShapeMain {

	public static void main(String[] args) {

		//Instantiating and calling parameterized constructor of square....
		Square s=new Square(3);
		//Instantiating and calling parameterized constructor of Rectangle...
		Rectangle r=new Rectangle (12,6);
		
		//Printing and calling the area...
		System.out.println("Area of Square is:"+s.area());
		System.out.println("Area Of rectange is"+r.area());

	}

}