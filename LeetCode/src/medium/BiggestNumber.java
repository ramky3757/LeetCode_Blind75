package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class BiggestNumber {
	
	public static void main(String[] args) {
		
		
		Vector<String> arr;
		arr = new Vector<>();

		// output should be 6054854654
		/*arr.add(54);
		arr.add(546);
		arr.add(548);
		arr.add(60);*/
		
		// output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
		printLargest1(arr);
		
		
	}

	
	static void printLargest(Vector<Integer> arr)
	{

		Collections.sort(arr, new Comparator<Integer>()
		{
			// A comparison function which is used by
			// sort() in printLargest()
			public int compare(Integer X, Integer Y)
			{

				// first append Y at the end of X
				Integer XY = X + Y;

				// then append X at the end of Y
				Integer YX = Y + X;

				// Now see which of the two
				// formed numbers
				// is greater
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});

		Iterator it = arr.iterator();

		while (it.hasNext())
			System.out.print(it.next());
	}
	
	static void printLargest1(Vector<String> arr)
    {
 
        Collections.sort(arr, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
 
        Iterator it = arr.iterator();
 
        while (it.hasNext())
            System.out.print(it.next());
    }
	
}
