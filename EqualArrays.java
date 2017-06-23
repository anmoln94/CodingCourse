package CodingCourse;

import java.util.HashMap;
import java.util.Map;

public class EqualArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={2,3,4,1,1,4,5,6};
		int[] arr2={1,1,2,3,4,5,5,4};
		
		if(arr1.length!=arr2.length)
		{
			System.out.println("arrays are not equal");
		}
		else
		{
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			for(int i=0;i<arr1.length;i++)
			{
				if(map.containsKey(arr1[i]))
				{
					map.put(arr1[i],map.get(arr1[i])+1);
				}
				else
				{
					map.put(arr1[i], 1);
				}
			}
			
			for(int j=0;j<arr2.length;j++)
			{
				if(map.containsKey(arr2[j]))
				{
					map.put(arr2[j], map.get(arr2[j])-1);
				}
				else
				{
					System.out.println("arrays are not equal");
					break;
				}
			}
			
	
			boolean arrequal=true;
			for(Map.Entry<Integer,Integer> mapcheck: map.entrySet())
			{
				if(mapcheck.getValue()>0)
				{
					arrequal=false;
					System.out.println("arrays are not equal");
					break;
				}
			}
			if(arrequal==true)
				System.out.println("arrays are equal");
			
		}
		
	}

}
