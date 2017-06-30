package CodingCourse;

public class PrintRecursionPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =16;
		pattern(number);

	}
	
	static void pattern(int number)
	{	
		if(number==0 || number<0)
		{
			System.out.print(number+" ");
			return;
		}
		
		System.out.print(number+" ");
		
		pattern(number-5);
		
		System.out.print(number+" ");
		
	}
	
}