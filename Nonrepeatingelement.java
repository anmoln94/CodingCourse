/*First 3 if conditions are bases cases. We have to use binary search to find the single non repeating element.
* Next, if mid is an even index then if everything was right, the next element would be the same, else make high = mid.
* if mid is an odd index then if everything was right, the previous element would be the same. Else, high = mid-1.
*/
package CodingCourse;

public class Nonrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,1,2,2,3,3,4,5,5};
		
		int low=0;
		int high = arr.length-1;
		int mid;
		boolean found = false;
		
		while(low<=high)
		{
			mid = (low+high)/2;
			
			if(mid==0 && arr[mid+1]!=arr[mid])
			{
				System.out.println(arr[mid]);
				found = true;
				break;

			}
			
			if(mid==arr.length-1 && arr[mid-1]!=arr[mid] )
			{
				System.out.println(arr[mid]);
				found = true;
				break;

			}
			
			
			if(arr[mid+1]!=arr[mid] && arr[mid-1]!=arr[mid] )
			{
				System.out.println(arr[mid]);
				found = true;
				break;

			}
	
			
			if(mid%2==0)
			{
				if(arr[mid]==arr[mid+1])
					low = mid+2;
				else
					high = mid;		//at mid+1 , new sequence begins so check till mid
			}
			else
			{
				if(arr[mid]==arr[mid-1])
					low = mid+1;
				else
					high = mid-1;	//at current mid new sequence began so check one index behind
			}
			
		}
		if(found==false)
			System.out.println("unique element not found");
	}

}
