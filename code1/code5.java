package code1;

 import java.util.Scanner;
 
public class code5 {
	   
		    public static void main(String[] args) {
		    
		       int quarters;   
		       int dimes;      
		       double dollars;
		       int pennies;   
		       
		       Scanner stdio = new Scanner( System.in );
		       
		      
		  	       
		       System.out.print("Enter the number of quarters:  ");
		       quarters = stdio.nextInt();
		       stdio.nextLine();
		       
		       System.out.print("Enter the number of dimes:     ");
		       dimes = stdio.nextInt();
		       stdio.nextLine();
		       
		       System.out.print("Enter the number of dollars");
		       dollars=stdio.nextInt();
		       stdio.nextLine();
		       
		       System.out.print("Enter the number of pennies:   ");
		       pennies = stdio.nextInt();
		       stdio.nextLine();
		       
		      
		       
		       dollars = (0.25 * quarters) + (0.10 * dimes) 
		                           + (0.05 * dollars)+(0.01* pennies); 
		       
		       
		       
		       System.out.println();
		       System.out.print("The total in dollars is $");
		       System.out.printf("%1.2f", dollars);  
		       System.out.println();
		    
		    }  
		  
		 }  