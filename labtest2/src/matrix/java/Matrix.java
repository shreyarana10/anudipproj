package matrix.java;
import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m,n;
        Scanner s=new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order here ............");
        
        m=s.nextInt();
        n=s.nextInt();
        
        int[][] m1 = new int[m][n];
        int[][] m2 = new int[m][n];
        int[][] m3 = new int[m][n];
        
        System.out.println("Enter the elements for the first matrix Here ..... ");
        int i, j;
        for(i = 0; i < m; i++)
        {
        for(j = 0; j < n; j++)
        m1[i][j] = s.nextInt();
        }
        
        System.out.println("Enter the elements for the Second  matrix Here ..... ");
        //int i, j;
        for(i = 0; i < m; i++)
        {
        for(j = 0; j < n; j++)
        m2[i][j] = s.nextInt();
        }
        
        for(i = 0; i < m; i++)
        {
        for(j = 0; j < n; j++)
        {
        m3[i][j] = m1[i][j] + m2[i][j];
        }
        }
        
        System.out.println("Here is the Sum of elements of both the matrix ");
        
        for(i = 0; i < m; i++)
        {
        for(j = 0; j < n; j++)
        System.out.print(m3[i][j] + " ");
        System.out.println();
        }
        
	}

}
