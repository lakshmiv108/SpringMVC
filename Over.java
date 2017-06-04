package vijji;

public class Over {

	public void a(int x)
	{
		System.out.println(x);
		System.out.println("super class method");
	}
	public void a(int x,float y)
	{
		System.out.println(x+ "  "+y);
		System.out.println("method2");
	}
	public static void main(String[] args)
	{
		Over o = new Over();
		o.a(6);
		o.a(7,8);
	}
}