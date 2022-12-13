import java.util.LinkedList;
import java.util.Queue;
/*
 * Name: Playlist
 * Author: Aaliyah Trotter 
 * Created: Oct 19, 2022
 * Course: CIS 152 Data Structures
 * OS: Mac
 * Copyright: This is my own original work based on
 * specifications issued by our instructor.
 * Description: This is where I set the structure for my play list.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or 
 * unmodified. I have not given other fellow student(s) access to
 * my program.       
 */
public class PlayList {
	private String songName;
	private String mood;
	
	public PlayList() {
		this.mood = mood;
		this.songName = songName;
	}
	
	public PlayList(String sn,String m) {
		this.mood = m;
		this.songName = sn;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
	
	@Override
	public String toString() {
		return "Song Name: " + songName + ", Mood: " + mood +"";
	}


}
