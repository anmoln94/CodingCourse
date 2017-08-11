/* Sort the array. Then keep two pointers low(index 0) and high(length-1). Find tempsum = arr[low]+arr[high].
If it is less than lowest sum calculated till now, sum = tempsum. index1=low, index2=high.
Now if, tempsum >0 , u decrease high to make the tempsum possibly closer to zero.
If tempsum <0, u increase low ( same logic)
If tempsum =0, u have found the two indexes. Break out.
*
*/

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
