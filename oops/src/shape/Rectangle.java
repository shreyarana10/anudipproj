package shape;

public class Rectangle extends Square{ ////Rectangle extends the square class....

	//Declaring Width...
	int width;
	
	//Parameterized constructor of Rectangle class....
	public Rectangle(int length,int width) {
		
		//Using super keyword calling the length variable which is declare in parent class(square)..
		super(length);
		this.width=width;
		}
	
	//Overriding the area method....
	public int area() {
		int ans;
		ans=length*width;
		return ans;
	}

}


