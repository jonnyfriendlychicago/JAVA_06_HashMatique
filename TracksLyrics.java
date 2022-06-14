import java.util.Set; 
import java.util.HashMap;
public class TracksLyrics {
    // public static void main (String[] args) {

        public String displayTrackAndLyricMthd(HashMap<String,  String> incomingHashMap) {


        Set <String> keysList = incomingHashMap.keySet(); 
    
        for (String iteratedKey: keysList) {
            System.out.println(iteratedKey + ": " + incomingHashMap.get(iteratedKey)); 

        }

        return "forgetAboutIt";

    }
}