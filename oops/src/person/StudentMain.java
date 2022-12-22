package person;

public class StudentMain {

	public static void main(String[] args) {


		String[] subjects= {"JAVA","DBMS","C++"};
		
        //Instantiation of students
		Student s1=new Student("Aakriti",21,"901234321","11",subjects);
		Student s2=new Student("Rana",21,"891121212","10",subjects);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	
	}

}