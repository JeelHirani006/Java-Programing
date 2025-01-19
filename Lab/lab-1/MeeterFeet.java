import java.util.Scanner;
public class MeeterFeet{
	public static void main (String args[])
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a meter ");
         double m=sc.nextFloat();
         double f=m/0.3048;
         System.out.println("Feet="+f);
	}
}
