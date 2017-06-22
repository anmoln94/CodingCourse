package CodingCourse;

import java.util.Arrays;

public class SumClosestoZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1, 60, -10, 70, -80, 85};
	
		
		int low=0;
		int high = arr.length-1;
		
		int index1=0;
		int index2=0;
		
		int sum=Integer.MAX_VALUE;
		Arrays.sort(arr);
		while(low<high)
		{
			int tempsum=arr[low]+arr[high];
			if(Math.abs(tempsum)<sum)
			{
				sum=Math.abs(tempsum);
				index1=low;
				index2=high;
			}
			if(tempsum>0)
			{
				high--;
			}
			else if(tempsum<0)
			{
				low++;
			}
			else
				break;
			
			
		}
		System.out.println("Number 1:"+arr[index1]);
		System.out.println("Number 2:"+arr[index2]);
		

	}

}
