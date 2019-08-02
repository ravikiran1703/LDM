package SelPractice;

import java.util.Scanner;

public class invertedtri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n;
		
		 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the number of rows");
		     n = sc.nextInt();
		    
		 for(i=1;i<=n;i++)
	     {
		         for(j=i;j<=n;j++)
		         {
		             System.out.print("*");
		        //     num++;
		         }
		     	   System.out.println(" ");
		     } 
	}

}
