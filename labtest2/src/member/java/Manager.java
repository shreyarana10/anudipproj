package member.java;

public class Manager extends Member{

	
	String specialization;

	 Manager(){
			
		     specialization = "c++ and java";
			
		}
		 

		 Manager(String specialization){
		 
			this.specialization=specialization;
		
			
		}
		 
			public void printsalary()
			{
				
				System.out.println("Person Department is = "+specialization);
				
				System.out.println("******************************************************");
				 
			}
}