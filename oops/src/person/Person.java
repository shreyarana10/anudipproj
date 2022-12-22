package person;

public class Person {
	
		//data members declaration
		String name;
		String mob;
		int age;
		 
		
			public Person(){    //Default Constructor 
				System.out.println("Default Constructor.....");	
			}
		//parameterized constructor	
		Person(String name,int age,String mob){
			this.name = name;  //this, is a reference variable 
			this.age = age;
			this.mob = mob;
			
		}
	}


