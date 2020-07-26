/*
Author: Awais Khatab
App: Binary Search with User Input
Version: 1.4
All rights reserved @Awais Khatab

HashMap solution to first non repeating character given within a string of characters
Big O Notation: O(2n) simplified O(n)
*/
import java.util.HashMap;

public class hashmap{
    public static void main(String[] args){
        String input = "aaaaabbbbccccdddeeefggghhiijjkkllmm";
        firstNonRepeatingCharacter(input);
    }

    public static void firstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
                System.out.println("Found Key: " + c + " New Value is: " + charCounts.get(c));
            }
            else {
                charCounts.put(c, 1);
                System.out.println("Adding Key: " + c + " Inputting Value: 1");
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (1 == charCounts.get(c)) {
                System.out.println("Operation Completed\n");
                System.out.println("First non-repeating char is: " + c);
                return;
            }
        }
    }
}
