package CodingCourse;

import java.util.ArrayList;

class Distance
{
	String cityname;
	int citydist;
	int cityindex;

}

public class GraphusingList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String city[] = new String[3];
		city[0]="Dallas";
		city[1]="Austin";
		city[2]="Washington";
		
		
		ArrayList<ArrayList<Distance>> distarr= new ArrayList<ArrayList<Distance>>();
		
		
		
		for(int i=0;i<city.length;i++)
		{
			ArrayList<Distance> dist= new ArrayList<Distance>();
			if(i==0)
			{
				Distance dst = new Distance();
				dst.cityname="Austin";
				dst.citydist=200;
				dst.cityindex=1;
				dist.add(dst);
				Distance dst1 = new Distance();
				dst1.cityname="Washington";
				dst1.citydist=0;
				dst1.cityindex=2;
				dist.add(dst1);
			}
			if(i==1)
			{
				Distance dst = new Distance();
				dst.cityname="Dallas";
				dst.citydist=200;
				dst.cityindex=0;
				dist.add(dst);
				Distance dst1 = new Distance();
				dst1.cityname="Washington";
				dst1.citydist=0;
				dst1.cityindex=2;
				dist.add(dst1);
			}
			if(i==2)
			{
				Distance dst = new Distance();
				dst.cityname="Dallas";
				dst.citydist=1300;
				dst.cityindex=0;
				dist.add(dst);
				Distance dst1 = new Distance();
				dst1.cityname="Austin";
				dst1.citydist=0;
				dst1.cityindex=1;
				dist.add(dst1);
			}
			distarr.add(dist);
			
		}
		
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<distarr.get(i).size();j++)
			{
				System.out.println(city[i]+" to "+distarr.get(i).get(j).cityname+" "+distarr.get(i).get(j).citydist+" (cityindex:"+distarr.get(i).get(j).cityindex+")");
			}
			
		}
		
	}

}
