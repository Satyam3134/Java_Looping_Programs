class Bonus
{
	public static void main(String... S)
	{
		System.out.print("Enter How many years of servise : ");
		int y=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter your salary : ");
		int s=new java.util.Scanner(System.in).nextInt();
		int pay,b;
		
		if(y>=5)
		{
			b=s*5/100;
			pay=s+b;
			System.out.print("You will get bonus "+pay+" with the bonus of "+b);
		}
		else 
			System.out.print("You will get "+s+" and You are not eligible for bonus ");
	}
}