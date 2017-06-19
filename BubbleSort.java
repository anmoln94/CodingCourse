package CodingCourse;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{5,11,2,3,4,34,22,2,1};
		
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			int j=arr.length-1;
			while(j>=i+1)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				j--;
			}
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}

}
