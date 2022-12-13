/*
 * Name: Node
 * Author: Aaliyah Trotter 
 * Created: Oct 19, 2022
 * Course: CIS 152 Data Structures
 * OS: Mac
 * Copyright: This is my own original work based on
 * specifications issued by our instructor.
 * Description: This is my node class to help assist with my linkedlist.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or 
 * unmodified. I have not given other fellow student(s) access to
 * my program.       
 */
public class Node {
	PlayList data;
	Node next;

	
	public Node() {
		this.data = data;
		this.next = null;
	}
	public Node(PlayList item) {
		this.data = item;
		this.next = null;
	}
	
	public PlayList getData() {
		return data;
	}
	public void setData(PlayList data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	



	

}
