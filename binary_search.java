import java.util.ArrayList;
import java.util.Scanner;

/*
Author: Awais Khatab
Binary Search with User Input
Version 1.1.0
V.Control: GitHub
*/

// Java implementation of recursive Binary Search (Decreasing)
class BinarySearch {
    int step = 0;
    // Returns index of x if it is present in list[l..
    // r], else return -1
    int binarySearch(ArrayList<Integer> list, int l, int h, int x) {
    	++step;
    	System.out.println("Step: " + step);
    	System.out.println("Low: " + l);
    	System.out.println("High: " + h);
    	System.out.println(" ");
    	
        if (h >= l) {
            int mid = l + (h - l)/2;
            // If the element is present at the 
            // middle itself
            if (list.get(mid) == x)
               return mid;
            // If element is smaller than mid, then 
            // it can only be present in left sub array
            if (list.get(mid) > x)
               return binarySearch(list, l, mid-1, x);
            // Else the element can only be present
            // in right sub array
            return binarySearch(list, mid+1, h, x);
        }
 
        //  When the element is not present in the array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        Scanner userInputArray = new Scanner(System.in);
        //SYSTEM MESSAGES AND USER INPUT
        System.out.println("Enter the size of the Array: ");
        int size = userInputArray.nextInt();
        size++;

        System.out.println("Enter number to find: ");
        int findX = userInputArray.nextInt();
        userInputArray.close();

        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int x = 0; x < size; x++){
            list.add(x);
        }

        BinarySearch obj = new BinarySearch();	//Using the function in this instance
        //List to be searched, User Input size();
        int n = list.size();
        // Element to find
        int x = findX;
        int result = obj.binarySearch(list,0,n-1,x);
        //!Element
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + result + "\nElement: "+ x);
    }
}		
//TIME COMPLEXITY: T(n) = T(n/2) + c 
//recursive implementation: O(Logn)
//iterative implementation: O(1)
//checking Working Copy Commit