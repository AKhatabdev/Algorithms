package Data_Structures;/*
Author: Awais Khatab
Title: HashMap to find first non-repeating character
Version: 1.4
All rights reserved @Awais Khatab

HashMap solution to first non repeating character given within a string of characters
Big O Notation: O(2n) simplified O(n)
*/
import java.util.HashMap;
import java.util.Scanner;

class hashmap{
    public static boolean checkFlag;
    public static void main(String[] args){
        System.out.println("This program will take in a 'string' of characters and will check to see which character is the first non-repeating!\nWhen you are prompted, enter in the characters you wish to check, once you are done press ENTER.\n");

        System.out.println("Enter in your characters: ");
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();
        firstNonRepeatingCharacter(input);
        userInput.close();
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
                System.out.println("Operation Completed!\n \nFirst non-repeating char is: " + c);
                return;
            }
        }
        if (!checkFlag){
            System.out.println("Operation Completed\n \nAll characters are repeating!");
        }
    }
}
