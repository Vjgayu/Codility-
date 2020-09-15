package code1;
import java.io.*;
public class code17 {
	  public static void main(String args[]) {
	         ThreadT1 a = new ThreadT1();
	         ThreadT2 b = new ThreadT2();
	         ThreadT3 c = new ThreadT3();
	         a.start();
	         b.start();
	         c.start();
	         System.out.println("... Multithreading is over ");
	    }	
	  class ThreadT1 extends Thread{
		     public void run( ) {
		        for(int i = 1; i <= 5; i++) {
		           System.out.println("From Thread A with i = "+ -1*i);
		        }
		        System.out.println("Exiting from Thread A ...");
		     }
		}

		class ThreadT2 extends Thread {
		    public void run( ) {
		       for(int j = 1; j <= 3; j++) {
		         System.out.println("From Thread B with j= "+2* j);
		       }
		       System.out.println("Exiting from Thread B ...");  
			}
		}
		class ThreadT3 extends Thread{
		     public void run( ) {
		         for(int k = 1; k <= 4; k++) {
		             System.out.println("From Thread C with k = "+ (2*k-1));
		         }
		         System.out.println("Exiting from Thread C ...");
		     }
		}
}