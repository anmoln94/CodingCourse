/*Given an array of sorted numbers from 1 to n-1, one element repeats itself consecutively.
This repeating element will be the first element whose value != index value+1.
*Apply binary search.
*/

package CodingCourse;

public class RepeatingElement {
	 public static void main(String[] args) 
	 {
		 int[] arr = new int[]{1,2,3,3}; //from 1 to n-1
		 
		 int low=0;
		 int high= arr.length-1;
		 int mid;
		 boolean found = false;
		 
		 while(low<=high)
		 {
			 mid = (low+high)/2;
			 if(arr[mid]!=mid+1)	//only the 2nd repetition has its index misplaced
			 {
				 if(mid>0 && arr[mid]==arr[mid-1])
				 {
					  System.out.println(arr[mid]);
					  found = true;
					  break;
				 }
				 else
				 {
					  high = mid-1;
				 }
				
			 }

			 else 
			 {
				 low = mid+1;
			 }	 
		 }
		 if(found==false)
			 System.out.println("no repeating element found");
	 }
}
