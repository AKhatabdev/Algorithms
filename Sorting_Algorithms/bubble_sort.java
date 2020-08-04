package Sorting_Algorithms;
/*
Author: Awais Khatab
Title: Bubble Sort with User Input
Version: 1.12
All rights reserved @Awais Khatab

Bubble Sort Example to sort numbers.
Big O Notation:
recursive implementation: O
iterative implementation: O
*/
public class bubble_sort {
    static class BubbleSort {
        //Sort Method
        void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (array[j] > array[j+1]) {
                        // swap arr[j+1] and arr[i]
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
        }
        void printArray(int[] array) {
            int n = array.length;
            for (int value : array) System.out.print(value + " ");
            System.out.println();
        }
        //Driver method to test above
        public static void main(String[] args) {
            BubbleSort ob = new BubbleSort();
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            ob.bubbleSort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
    }
}
