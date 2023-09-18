class Gratr
{
	public static void main(String... S)
	{
		System.out.print("Enter your first No. :");
		int f=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter your Second No. :");
		int s=new java.util.Scanner(System.in).nextInt();
		if(f>s)
			System.out.print(f+" is Grater then "+s);
		else if(f==s)
			System.out.print("Both are Equal");
		else
			System.out.print(s+" is Grater then "+f);
	}
}