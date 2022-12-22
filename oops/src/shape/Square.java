package shape;

public class Square implements Shape {
	//Declaring length...
		int length;
		
		//Parameterized constructor of Square...
		public Square(int length) {
			this.length=length;
		}
		

		@Override
		public int area() {
			int ans;
			ans=length*length;
			return ans;
		}

}
