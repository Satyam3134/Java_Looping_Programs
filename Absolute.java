class Absolute
{
	public static void main(String... S)
	{
		System.out.print("Enter Your Number : ");
		int n=new java.util.Scanner(System.in).nextInt();
		if(n<0)
		{
			int a=n*(-1);
			System.out.print("Absolute value is : "+a);
		}
		else
			System.out.print("Absolute value is : "+n);
	}
}