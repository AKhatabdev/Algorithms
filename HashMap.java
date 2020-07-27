/*
Author: Awais Khatab
Title: HashMap to find first non-repeating character
Version: 1.2
All rights reserved @Awais Khatab

HashMap solution to first non repeating character given within a string of characters
Big O Notation: O(2n) simplified O(n)
*/
import java.util.HashMap;

public class hashmap{
    public static boolean checkFlag;
    public static void main(String[] args){
        String input = "aaaaabbbbccccdddeeefggghhiijjkkllmm";
        firstNonRepeatingCharacter(input);
    }

    public static void firstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        checkFlag = false;

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
                checkFlag = true;
                System.out.println("Operation Completed\n");
                System.out.println("First non-repeating char is: " + c);
                return;
            }
        }
        if (!checkFlag){
            System.out.println("Operation Completed\n");
            System.out.println("All characters are repeating!");
        }
    }
}
