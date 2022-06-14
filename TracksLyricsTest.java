import java.util.Set; 
import java.util.HashMap;
public class TracksLyricsTest {
    public static void main (String[] args) {

        TracksLyrics TracksLyricsObj = new TracksLyrics(); 

        System.out.println("...drum-roll please... here comes the songs and lyrics"); 
        
        HashMap <String, String> songMap = new HashMap<String,  String> (); 
        songMap.put("Lucy in the Sky", "Picture yourself in a boat on a river..."); 
        songMap.put("Ticket to Ride", "I think I'm gonna be sad... I think it's today... yeah"); 
        songMap.put("Yesterday", "All my troubles seemed so far away... "); 

        TracksLyricsObj.displayTrackAndLyricMthd(songMap); 


    }
}