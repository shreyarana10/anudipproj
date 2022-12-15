package member.java;

public class Member {

	private String name;
	private int age;
	private String contact;
	private String address;
	private String salary;
	


	 Member(){
		
		name="Shreya ";
		age=21;
		contact="987654321";
		address="Bijnor";
		salary="30000";
	}
	 

	 Member(String name1,int age1, String contact1, String address1, String salary1 ){
		
		 name=name1;
		 age=age1;
		 contact=contact1;
		 address=address1;
		salary=salary1;
		
	}
	 
	 public void printsalary() {
		 
		 System.out.println("Name :  "+name);
		 System.out.println("..........");
		 System.out.println("Age :  "+age);
		 System.out.println("..........");
		 System.out.println("Contact :  "+contact);
		 System.out.println("..........");
		 System.out.println("Address :  "+address);
		 System.out.println("..........");
		 System.out.println("Salary :  "+salary);
		
	 }

}
