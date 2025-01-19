import java.util.Scanner;
public class Input2{
	public static void main (String args[])

	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		System.out.println(a);
		System.out.println("enter a integer ");
		int b=sc.nextInt();
		System.out.println(b);
		System.out.println("enter a float ");
		float c=sc.nextFloat();
		System.out.println(c);
		System.out.println("enter a double");
		double d=sc.nextDouble();
		System.out.println(d);
	}
}