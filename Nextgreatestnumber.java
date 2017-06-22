package CodingCourse;

import java.util.Arrays;

public class Nextgreatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'2','1','8','7','6','5'};
//		char arr[] = {'9','8','8'};
		
		int i=0;
		for(i = arr.length-1;i>0;i--)
		{
			if(arr[i]>arr[i-1])
				break;
		}
		
		if(i==0)
		{
			System.out.println("This is the largest possible number with these digits");
			
		}
		else
		{	
			Arrays.sort(arr,i,arr.length);
			int low=i;
			int high=arr.length-1;
			int mid=0;
			
			while(low<=high)
			{
				mid = (low+high)/2;
				if(arr[mid]<arr[i-1])
				{
					low=mid+1;
				}
				else
					high=mid-1;
			}
			
			char temp = arr[mid];
			arr[mid]=arr[i-1];
			arr[i-1]=temp;
			System.out.println(new String(arr));
		}
		
		
	}
}
