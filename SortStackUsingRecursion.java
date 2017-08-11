/* Recursively pop all elements of stack. Once stack becomes empty, recursively call sortinsert.
* Sortinsert keeps popping current stack elements to find the right position to push the element under consideration.
* Once it finds that position, push back all the elements back which were popped out.
*/

package CodingCourse;
import java.util.Stack;;

public class SortStackUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(32);
		stk.push(-3);
		stk.push(-33);
		stk.push(0);
		stk.push(45);
		
		sortstkrec(stk);
		
		while(!stk.isEmpty())
		{
			System.out.println(stk.pop());
		}
		
	}
	
	public static void sortstkrec(Stack<Integer> s1) {
		// TODO Auto-generated method stub
		if(!s1.isEmpty())
		{
			int temp=s1.pop();
			sortstkrec(s1);
			
			sortinsert(s1,temp);
		}
		
		
	}
	
	public static void sortinsert(Stack<Integer> s,int x)
	{
		if(s.isEmpty() || (x>s.peek()))
		{
			s.push(x);
			return;
		}
		
		int y=s.pop();
		sortinsert(s,x);
		s.push(y);
			
	}
}
