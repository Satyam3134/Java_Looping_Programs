class Leapyear 
{
  public static void main(String... S) 
  {
    System.out.print("Enter How many years of servise : ");
	int y=new java.util.Scanner(System.in).nextInt();
    if (y%4 == 0) 
          System.out.println(y + " is a leap year.");  
    else
      System.out.println(y + " is not a leap year.");
  }
}