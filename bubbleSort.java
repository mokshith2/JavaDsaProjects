// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class ArrayBub
{
private long[] a;
private int nElems;
// ref to array a
// number of data items
//--------------------------------------------------------------
public ArrayBub(int max)
{
// constructor
a = new long[max];
nElems = 0;
}
// create the array
// no items yet
//--------------------------------------------------------------
public void insert(long value)
{
// put element into array
a[nElems] = value;
nElems++;
}
// insert it
// increment size
//--------------------------------------------------------------
public void display()
{
// displays array contents
for(int j=0; j<nElems; j++)
// for each element,
System.out.print(a[j] + “ “); // display it
System.out.println(“”);
}
//--------------------------------------------------------------
public void bubbleSort()
86
CHAPTER 3 Simple Sorting
LISTING 3.1 Continued
{
int out, in;
for(out=nElems-1; out>1; out--) // outer loop (backward)
for(in=0; in<out; in++)
if( a[in] > a[in+1] )
swap(in, in+1);
// inner loop (forward)
// out of order?
// swap them
} // end bubbleSort()
//--------------------------------------------------------------
private void swap(int one, int two)
{
long temp = a[one];
a[one] = a[two];
a[two] = temp;
}
//--------------------------------------------------------------
} // end class ArrayBub
////////////////////////////////////////////////////////////////
class BubbleSortApp
{
public static void main(String[] args)
{
int maxSize = 100;
ArrayBub arr;
// array size
// reference to array
arr = new ArrayBub(maxSize); // create the array
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
LISTING 3.1 Continued
arr.display();
// display them again
} // end main()
} // end class BubbleSortApp

