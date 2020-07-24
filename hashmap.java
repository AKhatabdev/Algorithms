/*
Author: Awais Khatab
App: Binary Search with User Input
Version: 1.4
All rights reserved @Awais Khatab
*/
//HashMap solution to frist non repeating character given within an array of characters
// Example Array = {a,a,a,b,b,b,c,c,c,d,e,e,e,f,f,f}
// O(2n) simplified O(n)

import java.util.HashMap;

public class hashmap{
    char firstNonRepeatingCharacter(String s){
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCounts.containsKey(c)){ charCounts.put(c, charCounts.get(c) + 1;}
            else { charCounts.put(c, 1);}

            for(int i = 0; i < s.length(); i++){ char.c = s.charAt(i);
                if(charCounts.get(c) == 1) return c;}
        }
    }
}
