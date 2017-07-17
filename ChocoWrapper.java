package CodingCourse;

public class ChocoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  money = 15, price = 1, wrap = 3;
		
		System.out.print((money/price)+chocrec(money/price,wrap));
	}
	static int chocrec(int newchocs,int wrap)
	{
		if(newchocs<wrap)
		{
			return 0;
		}
		
		int chocwrap=newchocs/wrap;
		
		return chocwrap+chocrec(chocwrap+(newchocs%wrap),wrap);
	}

}
