import java.util.ArrayList;
// Java implementation of recursive Binary Search (Decreasing)
class BinarySearch
{
	int step = 0;
    // Returns index of x if it is present in list[l..
    // r], else return -1
    int binarySearch(ArrayList<Integer> list, int l, int h, int x) //METHOD
    {
    	++step;
    	
    	System.out.println("Step: " + step);
    	System.out.println("Low: " + l);
    	System.out.println("High: " + h);
    	System.out.println(" ");
    	
        if (h >= l)
        {
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
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>(100);
        for(int x = 0; x < 100; x++){
            list.add(x);
    }

        BinarySearch ob = new BinarySearch();	//Using the function in this instance
        				//List to be searched
        int n = list.size();					//Length of List 0,1,2,3,4,5,6,7,8,9,10 = 11
        
        int x = 75;		// Element to find
        
        int result = ob.binarySearch(list,0,n-1,x);
        
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index: " + result + "\nElement: "+ x);
    }
}		
//TIME COMPLEXITY: T(n) = T(n/2) + c 
//recursive implementation: O(Logn)
//iterative implementation: O(1)
