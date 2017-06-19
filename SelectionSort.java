package CodingCourse;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{5,2,8,4,1};
		
		for(int i=0;i<arr.length;i++)
		{
			int min_index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
					
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
			
		}
		for(int k = 0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
			System.out.print(" ");
		}
		
	}

}
