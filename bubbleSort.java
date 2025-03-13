
/*******************************************************************************
Mokshith Bharadwaj

03/12/25
********************************************************************************
Data Structures and Algorithms
Chapter 3 - Assignment #1

Problem
In the bubbleSort.java program (Listing 3.1), the in index always goes from
left to right, finding the largest item and carrying it toward out on the right.
Modify the bubbleSort() method so that it’s bidirectional. This means the in
index will first carry the largest item from left to right as before, but when it
reaches out, it will reverse and carry the smallest item from right to left.
You’ll need two outer indexes, one on the right (the old out) and another on
the left.

this program will add code to the bubbleSort( ) method that counts the total number of
comparisons and swaps that are performed during the Sort operation.
Use the program shown in Listing 3.1. Read all data from an input file.
Change the program to follow the Style Guide. Make sure you use better
variable names, comment each class and
method, use proper indentation, use proper spacing within expressions, and
other changes as dictated by the Style Guide.
*/
// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
package  arraybub;
public class bubbleSort
{
    public static void main(String[] args)
    {
    int maxSize = 100;
    // array size
    // reference to array
    arraybub arr = new arraybub(maxSize); // create the array
    arr.insert(77);
    // insert 10 items
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);
    arr.display();
    arr.bubbleSort();
    // display items
    // bubble sort them
    arr.display();
    // display them again
    } // end main()
} // end class BubbleSortApp

