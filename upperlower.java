public class Upperlower
{
   public static void main(String... S) 
   {
      System.out.print("Enter your character : ");
      char input = new  java.util.Scanner(System.in).next().charAt(0);
      System.out.println("Character: "+input);
	  
      if (Character.isUpperCase(input)) 
         System.out.println("Character is in Uppercase!");
	  else 
         System.out.println("Character is in Lowercase!");
   }
}