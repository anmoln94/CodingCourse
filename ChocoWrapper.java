/* In recursion, the number of chocolates you can buy with the wrappers = wrappers/cost of each wrapper.
The remaining unused wrappers = wrappers%cost of each wrapper will again be added.

For eg: if 5 wrappers came and cost to buy each chocolate is 3 wrappers, then 5/3 wrappers = 1 chocolate(=1 wrapper) + 2 unused wrapper.
*/

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
