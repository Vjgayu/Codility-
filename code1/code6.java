package code1;
import java.util.*;
public class code6 {
public static void main (String[] args) {
Vector<String>	vec_tor = new Vector<String>();
vec_tor.add("t");
vec_tor.add("e");
vec_tor.add("k");
vec_tor.add("a");
vec_tor.add("r");
vec_tor.add("c");
vec_tor.add("h");

System.out.println("Vector:" +vec_tor);
	String rem_ele = vec_tor.remove(6);
	 System.out.println("Removed element: " + rem_ele); 
	 System.out.println("Final Vector: " + vec_tor);	
}
}
