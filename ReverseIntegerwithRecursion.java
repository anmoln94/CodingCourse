package CodingCourse;

public class ReverseIntegerwithRecursion {
	public static int number_till_now=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=435;
		int reverse=reverse_num(num);
		
		System.out.print(reverse);
		
	}
	static int reverse_num(int number)
	{
		int quo=number/10;
		int rem=number%10;
		number_till_now=number_till_now*10+rem;
		
		if(quo==0)
			return number_till_now;
		else
			return reverse_num(quo);
	}
}
