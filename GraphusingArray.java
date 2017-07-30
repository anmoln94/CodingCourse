package CodingCourse;

public class GraphusingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city[] = new String[3];
		city[0]="Dallas";
		city[1]="Austin";
		city[2]="Washington";
			
		Integer dist[][] = new Integer[3][3];
		dist[0][0]=0;
		dist[0][1]=200;
		dist[0][2]=0;
		dist[1][0]=200;
		dist[1][1]=0;
		dist[1][2]=0;
		dist[2][0]=1300;
		dist[2][1]=0;
		dist[2][2]=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(city[i]+" to ");
				System.out.print(city[j]+" is "+dist[i][j]);
				System.out.println();
			}
			
		}
		
		

	}

}
