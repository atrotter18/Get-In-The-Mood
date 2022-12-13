import java.util.LinkedList;
/*
 * Name: Queue
 * Author: Aaliyah Trotter 
 * Created: OCt 19, 2022
 * Course: CIS 152 Data Structures
 * OS: Mac
 * Copyright: This is my own original work based on
 * specifications issued by our instructor.
 * Description: This is where I create my queue.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or 
 * unmodified. I have not given other fellow student(s) access to
 * my program.       
 */
public class queue {
	private Node head;
	private Node tail;
	private int size;
	private Node sort;
	private LinkedList<PlayList> list;
	
	public queue() {
		this.size = 0;
		this.head = null;
		this.tail = null;
		LinkedList<PlayList> list;
	}
	public queue(String sn, String m) {
		this.size = 0;
		this.head = null;
		this.tail = null;
		LinkedList<PlayList> list;
	}

	public int size() {
		return size;
	}
	
	 public boolean isEmpty() { 
		if(head != null || tail != null) {
			return false;
			}
			return true;
		}
	 
	public String peek() throws QueueEmptyException{
		if(!isEmpty()) {
			head.getData();
			}
			throw new QueueEmptyException();
		}
	
	public void enqueue(PlayList item) {
		Node n = new Node(item);
		if(head == null) {
			tail = n;
			head = n;
			size++;
		}else {
			tail.setNext(n);
			tail = n;
			size++;
		}
	}

	public PlayList dequeue() throws QueueEmptyException{
		if(head == null) {
			throw new QueueEmptyException();
		}else {
			Node item = head;
			head = head.getNext();
			item.setNext(null);
			size--;
			
			return item.getData();
			}
		/*
		String item = null;
		if(head != null) {
			if(head.getNext() != null) {
				new Node(head.getData());
				head = head.getNext();
			}else {
				new Node(head.getData());
				head = null;
				tail = null;
				size--;
			}
			throw new QueueEmptyException();
		}
		return item;
		*/
	}
	public Node sort(Node start, Node end) {
		if(start == end || start == null || end == null)
			return start;
		
		Node prev = start;
		Node current = start;
		PlayList p = end.data;
		
		while(start != end) {
			if(start.data == p) {
				prev = current;
				PlayList temp = current.data;
				start.data = temp;
				current = current.next;
			}
			start = start.next;
		}
		PlayList temp = current.data;
		current.data = p;
		end.data = temp;
		
		return current;
	}
	
	public void quickSort(Node start, Node end) {
		if(start == null || start == end || start == end.next)
			return;
			
		Node current = sort(start,end);
		quickSort(start, current);
		if(current != null && current == start)
			sort(current.next,end);
		else if(current !=null && current.next!= null)
			sort(current.next.next,end);
	}

	public void print() {
		while(head != null) {
			System.out.println(head.getData() + " ");
			head = head.getNext();
		}
	}


}
