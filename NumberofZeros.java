package CodingCourse;

public class NumberofZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,1,1,1,1,1,0};
		
		int low=0;
		int high=arr.length-1;
		int mid=0;
		boolean found = false;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(arr[mid-1]==1 && arr[mid]==0)
			{
				System.out.println(arr.length-mid);
				found = true;
				break;
			}
			
			if(arr[mid]==1)
				low=mid+1;
			else
				high=mid-1;
		}
				
		if(found==false)
			System.out.println(0);
	}

}
