class Squr
{
	public static void main(String... S)
	{
		System.out.print("Enter the Length of your Shape :");
		int l=new java.util.Scanner(System.in).nextInt();
		
		System.out.print("Now Enter the Breath of your Shape :");
		int b=new java.util.Scanner(System.in).nextInt();
		
		if(l==b)
			System.out.print("It is Square");
		else
			System.out.print("It is Not Square");
			
	}
}