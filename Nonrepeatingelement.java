package CodingCourse;

public class Nonrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,2,2,3,3};
		
		int low=0;
		int high = arr.length-1;
		int mid;
		boolean found = false;
		
		while(low<=high)
		{
			mid = (low+high)/2;
			
			if(low==high)
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
					high = mid;
			}
			else
			{
				if(arr[mid]==arr[mid-1])
					low = mid+1;
				else
					high = mid-1;	//every odd element is the first element in the seq
			}
			
		}
		if(found==false)
			System.out.println("unique element not found");
	}

}
