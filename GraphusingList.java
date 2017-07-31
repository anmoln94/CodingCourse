package CodingCourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
		String city[] = new String[5];
		city[0]="Dallas";
		city[1]="Austin";
		city[2]="Washington";
		city[3]="Chicago";
		city[4]="Detroit";
		
		
		
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
				dst1.citydist=400;
				dst1.cityindex=2;
				dist.add(dst1);
			}
			if(i==1)
			{
				Distance dst = new Distance();
				dst.cityname="Chicago";
				dst.citydist=200;
				dst.cityindex=3;
				dist.add(dst);
				Distance dst1 = new Distance();
				dst1.cityname="Dallas";
				dst1.citydist=200;
				dst1.cityindex=0;
				dist.add(dst1);
				
		
			}
			if(i==2)
			{
				Distance dst = new Distance();
				dst.cityname="Detroit";
				dst.citydist=1300;
				dst.cityindex=4;
				dist.add(dst);
			}
			distarr.add(dist);
			
		}
		
		System.out.println("Graph is as below:");
		
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<distarr.get(i).size();j++)
			{
				System.out.println(city[i]+" to "+distarr.get(i).get(j).cityname+" "+distarr.get(i).get(j).citydist+" (cityindex:"+distarr.get(i).get(j).cityindex+")");
			}
			
		}
		System.out.println("\n");
		
		//DFS
		boolean visited_dfs[] = new boolean[city.length];

		Stack<Integer> stk = new Stack<Integer>();
		System.out.print("DFS: ");
		DFS(city,distarr,stk,visited_dfs,0);
		System.out.println();
		System.out.print("BFS: ");
		
		//BFS
		boolean visited[]=new boolean[city.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		
		while(!q.isEmpty())
		{
			int temp=q.remove();
			
			System.out.print(city[temp]+" ");
			visited[temp]=true;
			
				
			for(int j=0;j<distarr.get(temp).size();j++)
			{
				if(!visited[distarr.get(temp).get(j).cityindex] && !q.contains(distarr.get(temp).get(j).cityindex))
				{
					q.add(distarr.get(temp).get(j).cityindex);
				}
			}
		}
		
		
	}
	
	public static void DFS(String[] city,ArrayList<ArrayList<Distance>> dist,Stack<Integer> stk,boolean[] visited_dfs,int cityindex)
	{
		stk.push(cityindex);
		visited_dfs[cityindex]=true;
		System.out.print(city[cityindex]+" ");
		// DFS
		if (!stk.isEmpty()) 
		{
			for(int j=0;j<dist.get(cityindex).size();j++)
			{
				if(!visited_dfs[dist.get(cityindex).get(j).cityindex])
				{
					DFS(city,dist,stk,visited_dfs,dist.get(cityindex).get(j).cityindex);
					stk.pop();
				}
			}

		}
		
	}

}
