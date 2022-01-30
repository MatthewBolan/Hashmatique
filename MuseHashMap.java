import java.util.HashMap;

import java.util.Set;

public class MuseHashMap {

    public static void main(String[] args) {

        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("Sunburn", "Come waste your millions here!");

        userMap.put("Muscle Museum", "She had something to confess...");

        userMap.put("Fillip", "it's gonna be our last memory...");

        userMap.put("Falling Down", "They were all begging for your dream!");


        // get the keys by using the keySet method

        Set<String> lyrics = userMap.keySet();

        for(String track : lyrics) {

            System.out.println("Song: " + track);

            System.out.println("Sample lyric's: " + userMap.get(track));

            System.out.println();

        }

        System.out.println(userMap.get("Sunburn"));

    }
}

