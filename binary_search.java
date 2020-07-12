/*
Author: Awais Khatab
App: Binary Search with User Input
Version: 1.4
All rights reserved @Awais Khatab
*/
import java.util.ArrayList;
import java.util.Scanner;

// Java implementation of recursive Binary Search (Decreasing)
class BinarySearch {
    public static int step;
    // Returns index of x if it is present in list[l..r], else return -1
    int binarySearch(ArrayList<Integer> list, int l, int h, int x) {
    	++step;
    	System.out.println("Step: " + step);
    	System.out.println("Low: " + l);
    	System.out.println("High: " + h);
    	System.out.println(" ");
    	
        if (h >= l) {
            int mid = l + (h - l)/2;
            // If the element is present at the middle itself
            if (list.get(mid) == x)
               return mid;
            // If element is smaller than mid, then it can only be present in left sub array
            if (list.get(mid) > x)
               return binarySearch(list, l, mid-1, x);
            // Else the element can only be present in right sub array
            return binarySearch(list, mid+1, h, x);
        }
        //  When the element is not present in the array
        return -1;
    }
    // Driver method to test above
    public static void main(String args[]) {
        int size = 0;
        Scanner userInputArray = new Scanner(System.in);
        //User Input (Size of Array)
        System.out.println("Enter the size of the Array: ");
        //Validation
        while (!userInputArray.hasNextInt()) {
                String input = userInputArray.next();
                System.out.printf("\"%s\" not a valid input, please enter a valid number!.\n", input);
            }
        size = userInputArray.nextInt();
        size++;
        //User Input (Find Number)
        System.out.println("Enter number to find: ");
        //Validation
        while(!userInputArray.hasNextInt()){
            String input = userInputArray.next();
            System.out.printf("\"%s\" not a valid input, please enter a valid number!.\n", input);
        }
        int findX = userInputArray.nextInt();
        userInputArray.close();
        //Creates an Array from user input (0, 1, 2,...Size)
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int x = 0; x < size; x++){
            list.add(x);
        }
        //Using the function in this instance
        BinarySearch obj = new BinarySearch();
        //List to be searched, User Input size();
        int n = list.size();
        // Element to find
        int x = findX;
        int result = obj.binarySearch(list,0,n-1,x);
        //!Element
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + result + "\nNumber: "+ x +"\nCompleted in: "+ step +" Steps");
    }
}		
//TIME COMPLEXITY: T(n) = T(n/2) + c 
//recursive implementation: O(Logn)
//iterative implementation: O(1)
