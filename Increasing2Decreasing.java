package CodingCourse;

public class Increasing2Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,2,3,1};
		
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		boolean found=false;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
			{
				found=true;
				System.out.println(arr[mid]);
				break;
			}
			
			if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid])
			{
				high=mid-1;
			}
			else if(arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid])
			{
				low = mid+1;
			}
		}
	}

}
