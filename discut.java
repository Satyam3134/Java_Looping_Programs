class Discut
{
	public static void main(String... S)
	{
		System.out.print("Enter How much Quantity do you Purchase : ");
		int p=new java.util.Scanner(System.in).nextInt();
		int pay,d,t=p*100;
		if(t>=1000)
		{
			d=t*10/100;
			pay=t-d;
			System.out.print("You have to pay "+pay+" 10% Discount of "+d+ " add to your bill");
		}
		else 
			System.out.print("You have to pay "+t+" no Discount avilable");
	}
}