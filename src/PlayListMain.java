/*
 * Name: Play List Main
 * Author: Aaliyah Trotter 
 * Created: OCt 19, 2022
 * Course: CIS 152 Data Structures
 * OS: Mac
 * Copyright: This is my own original work based on
 * specifications issued by our instructor.
 * Description: This is where I create my GUI and implement all my features.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or 
 * unmodified. I have not given other fellow student(s) access to
 * my program.       
 */
public class PlayListMain {

	public static void main(String[] args) throws QueueEmptyException {
		
		//new GUI();
	
		queue j = new queue();
		j.enqueue(new PlayList("man","jail"));
		j.enqueue(new PlayList("man","jail"));
		j.enqueue(new PlayList("man","jail"));
		j.enqueue(new PlayList("man","jail"));
		
		j.dequeue();
		j.dequeue();
		j.dequeue();
	
		
		
		
		
		
		j.print();
		
		
		
		

		
		
		
		
	
	
	}

}
