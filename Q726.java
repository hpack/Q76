
public class Q726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gcf(99,21));
	}
	
	public static int gcf(int a, int b)
	{
		while(a != 0)
		{
			int temp = a;
			
			a = b % a;
			
			b = temp;
			
		}
		
		return b;
	}
}
