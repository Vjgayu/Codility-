package code1;

import java.sql.Statement;
import java.util.*; 
public class code15 (String name, int studentid) {
	 
	PriorityQueue<Integer> studentid = new PriorityQueue<>();

    // Add items to a Priority Queue (ENQUEUE)
    studentid.add(750);
    studentid.add(500);
    studentid.add(900);
    studentid.add(100);


    while (!studentid.isEmpty()) {
        System.out.println(studentid.remove());
    }

}
	
}      