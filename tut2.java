package pkg1;

public class tut2 {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("output is :"+c);
	}
public static void main(String[] args) {
	tut2 ref=new tut2();
	int result_sum= ref.sum(10,2);
	int result_sub= ref.sub(result_sum,2);
	int result_sum1= ref.sum(result_sub,2);
	int result_mul= ref.mul(result_sum1,2);
	ref.div(result_mul,2);
	
	
}
}
