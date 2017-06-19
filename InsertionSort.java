package CodingCourse;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,5,3,2,2,6,4,8};
		int i,j;
		
		
		for(i=1;i<arr.length;i++) //Best case O(n); Worst Case O(n^2)
		{
			int temp=arr[i];
			
			j=i-1;
			while(j>=0 && arr[j]>temp) 
			{
				arr[j+1]=arr[j];
				j--;	
			}
			
			arr[j+1]=temp;
			
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
	}

}
