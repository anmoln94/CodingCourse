package CodingCourse;

public class SelectionSortRecursion {

	static int min_index=0;
	static int[] arr=new int[]{6,1,5,3,6};
	static int i=0;
	static int j=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		recursion();
	}
	
	static void recursion()
	{	
		
		if(j<arr.length)
		{
			if(arr[j]<arr[min_index])
			{
				min_index=j;
			}
			j++;
			recursion();
		}
		else
		{
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
			System.out.println(arr[i]+" ");
			i++;
			j=i+1;
			min_index=i;
			
			if(i<arr.length)
			{
				recursion();
			}
			else
				return;

		}
	}
}
