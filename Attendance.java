class Attendance
{
	public static void main(String... S)
	{
		System.out.print("Enter number of classes held : ");
		int c=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter number of classes attend : ");
		int a=new java.util.Scanner(System.in).nextInt();
		int t=(a*100)/c;
		if(t>=75 && a<c)
		{
			System.out.print("You are allowed to sit in exam");
		}
		else if(a>c)
			System.out.print("Wrong entry! please check");
		else
		{
			System.out.println("You are not allowed to sit in exam because your attendance in less than 75%");
			System.out.print("Medical cause? (y/n) ) : "); 
			char input = new  java.util.Scanner(System.in).next().charAt(0);
			if(input=='y' || input=='y')
				System.out.print("You are allowed to sit in exam");
		}			
	}
}