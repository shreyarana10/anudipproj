package member.java;

public class Employee extends Member {
	
	String department;

	 Employee(){
			
		    department=" Engineering and Research ";
			
		}
		 

		 Employee(String derpartment){
		 
			this.department=department;
		
			
		}
		 
			public void printsalary()
			{
				
				System.out.println("Person Department is = "+department);
				
				System.out.println("******************************************");
				 
			}


}