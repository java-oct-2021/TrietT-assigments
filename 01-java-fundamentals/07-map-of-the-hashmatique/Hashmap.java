import java.util.HashMap;

/*
Objectives:
● Create your first HashMap.
● Iterate over a HashMap.

Tasks:
● Create a trackList of type HashMap
● Add in at least 4 songs that are stored by title
● Pull out one of the songs by its track title
● Print out all the track names and lyrics in the format Track: Lyrics 
 */

public class Hashmap 
{
    public static void main(String[] args) 
    {
        HashMap <String, String> trackList = new HashMap<String, String>();
        trackList.put("track1", "lyrics1");
        trackList.put("track2", "lyrics2");
        trackList.put("track4", "lyrics4");
        trackList.put("track4", "lyrics4");
        set<String> keys = trackList.keySet();
        for(String key :  keys)
        {
            System.out.println("Track name: " + key);
            System.out.println("Lyrics name: " + trackList.get(key));
        }

    }
        
}
    

