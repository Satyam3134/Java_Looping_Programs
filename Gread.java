class Gread{
	public static void main(String... S)
	{
		System.out.print("Enter How many years of servise : ");
		int num=new java.util.Scanner(System.in).nextInt();
     if(num>80)
        System.out.print("You get A gread");

    else if(num==80 || num>60)
        System.out.print("You get B gread");
        
    else if(num==60 || num>50)
        System.out.print("You get C gread");
        
    else if(num==50 || num>40)
        System.out.print("You get D gread");
        
	 else if(num==40 || num>30)
        System.out.print("You get E gread");
      	
     else
        System.out.print("You get F gread");   
	}
}