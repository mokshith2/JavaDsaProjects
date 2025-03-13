class ArrayBub
{
	private long[] a;
	private int nElems;

	// ref to array a
	// number of data items
	//--------------------------------------------------------------
	ArrayBub(int max)
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
			System.out.print(a[j] + " "); // display it
		System.out.println(" ");
	}
	//--------------------------------------------------------------
	public void bubbleSort()
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