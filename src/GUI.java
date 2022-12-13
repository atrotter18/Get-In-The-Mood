import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Name: Songs
 * Author: Aaliyah Trotter 
 * Created: OCt 19, 2022
 * Course: CIS 152 Data Structures
 * OS: Mac
 * Copyright: This is my own original work based on
 * specifications issued by our instructor.
 * Description: This is where I create my GUI.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or 
 * unmodified. I have not given other fellow student(s) access to
 * my program.       
 */
public class GUI extends PlayList implements ActionListener{
	private JPanel p;
	private JFrame f;
	private JTextField mood;
	private JTextField sName;
	LinkedList<PlayList> chill = new LinkedList<PlayList>();
	LinkedList<PlayList> happy = new LinkedList<PlayList>();
	LinkedList<PlayList> sad = new LinkedList<PlayList>();
	LinkedList<PlayList> motivation = new LinkedList<PlayList>();
	
	public GUI() {
		
		f = new JFrame();
		p = new JPanel();
		
		JLabel l = new JLabel("What is the song name? ");
		sName = new JTextField("");
		l.setFont(new Font("serif",Font.BOLD,13));
		
		JLabel m = new JLabel("What is the mood of the song? ");
		m.setFont(new Font("serif",Font.BOLD,13));
		
		JLabel re = new JLabel("( sad, happy, motivational, chill )");
		re.setFont(new Font("serif",Font.ITALIC, 11));
		mood = new JTextField("");
		
		//This class is going to add songs to the certain play list.
		JButton addButton = new JButton ("Add");
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String feel = mood.getText();
				String songName = sName.getText();
				
				if(feel.equalsIgnoreCase("happy")) {
					happy.addFirst(new PlayList(sName.getText(), mood.getText()));
					System.out.println("Successfully added to " + feel + " playlist!");
					//System.out.println(happy);
					//System.out.println(happy.size());
					
				}else if(feel.equalsIgnoreCase("sad")) {
					sad.addFirst(new PlayList(sName.getText(), mood.getText()));
					System.out.println("Successfully added to " + feel + " playlist!");
					//System.out.println(sad);
					
				}else if(feel.equalsIgnoreCase("motivational")) {
					motivation.addFirst(new PlayList(sName.getText(), mood.getText()));
					System.out.println("Successfully added to " + feel + " playlist!");
					//System.out.println(motivation);
					
				}else if(feel.equalsIgnoreCase("chill")) {
					chill.addFirst(new PlayList(sName.getText(), mood.getText()));
					System.out.println("Successfully added to " + feel + " playlist!");
					//System.out.println(chill);
					//System.out.println(chill.peek());
					
					
				}else {
					System.out.println("Please enter in one of the four mood categories.");
				}
			}
			
		});
		
		//This class is going to delete songs from the certain play list.
		JButton deleteButton = new JButton ("Delete");
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e){
				String feel = mood.getText();
				String songName = sName.getText();
				
				if(!happy.isEmpty()) {
					happy.removeLast();
					System.out.println("Successfully been deleted from the " + feel + " playlist!");
					//System.out.println(happy);
				
				}else if(!sad.isEmpty()) {
					sad.removeLast();
					System.out.println("Successfully been deleted from the " + feel + " playlist!");
					//System.out.println(sad);
			
				}else if(!motivation.isEmpty()) {
					motivation.removeLast();
					System.out.println("Successfully been deleted from the " + feel + " playlist!");
					//System.out.println(motivation);
					
				}else if(!chill.isEmpty()) {
					chill.removeLast();
					System.out.println("Successfully been deleted from the " + feel + " playlist!");
					//System.out.println(chill);
				
				}else {
					System.out.println("Your playlist is empty!!");
				}
			}
			
		});
		
		//This button just clears out the fields on the screen.
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sName.setText(null);	
				mood.setText(null);
			}
			
		});
		
		//adding fields, buttons, layouts, etc
		p.setBorder(BorderFactory.createEmptyBorder(100,100, 100 , 100));
		p.setLayout(new GridLayout(0,1));
		
		p.add(l);
		p.add(sName);
		p.add(m);
		p.add(re);
		p.add(mood);
		p.add(addButton);
		p.add(deleteButton);
		p.add(clearButton);
		
		f.add(p, BorderLayout.CENTER);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setTitle("Playlist Organizer");
		f.pack();
		f.setVisible(true);
	}
	
	//My demo code, until I figured out what I wanted things to look like.
	
	//Method to add to the linked list
	/*@Override
	public void actionPerformed(ActionEvent e) {
		String feel = mood.getText();
		String songName = sName.getText();
		
		if(feel.equalsIgnoreCase("happy")) {
			happy.add(new PlayList(sName.getText(), mood.getText()));
			System.out.println("Successfully added to " + feel + " playlist!");
			//System.out.println(happy);
			enqueue(songName);
			
		}else if(feel.equalsIgnoreCase("sad")) {
			sad.add(new PlayList(sName.getText(), mood.getText()));
			System.out.println("Successfully added to " + feel + " playlist!");
			//System.out.println(sad);
			enqueue(songName);
			
		}else if(feel.equalsIgnoreCase("motivational")) {
			motivation.add(new PlayList(sName.getText(), mood.getText()));
			System.out.println("Successfully added to " + feel + " playlist!");
			//System.out.println(motivation);
			enqueue(songName);
			
		}else if(feel.equalsIgnoreCase("chill")) {
			chill.add(new PlayList(sName.getText(), mood.getText()));
			System.out.println("Successfully added to " + feel + " playlist!");
			//System.out.println(chill);
			enqueue(songName);
			
		}else {
			System.out.println("Please enter in one of the four mood categories.");
		
		}*/
		/*
		if(feel.equalsIgnoreCase("sad") || feel.equalsIgnoreCase("happy") || feel
			.equalsIgnoreCase("motivational") ||
				feel.equalsIgnoreCase("chill")) {
			list.add(new PlayList(sName.getText(), mood.getText()));
			System.out.println(list);
			System.out.println("Successfully added to " + feel + " playlist!");
			
		}else {
			
			System.out.println("Please enter in one of the four mood categories.");
		}*/
	
}
