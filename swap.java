
public class swap 
{
	public static void main(String[]args)
	{
		int a,b;
		a=10;
		b=5;
		System.out.println("value before swapping is :");
		System.out.println("b="+b);
		System.out.println("a="+a);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value after swapping is :");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
