package javaproj;

public class hellloworld {
	
	
	public static void main(String[] args) {
		 int [] arr1 = new int [] {10, 30, 60, 40, 50};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Displaying elements of array arr1     
        System.out.println(" original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}    
		
		
		
		
		/*String []ar1= {"Aman","Shubham","Atul","Shreya"};
		  String []ar2=new String[4];
		  System.out.println("Ar1  ......");
		 
		  printArray(ar1);
		  
		  System.arraycopy(ar1,1, ar2, 2, 2);
		  
		  System.out.println("Ar2  ......");
		  printArray(ar2);*/
	 
