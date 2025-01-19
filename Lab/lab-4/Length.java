import java .util.Scanner;
public class Length{
	public static void main (String[]args)
	{
          Scanner sc = new Scanner(System.in);
          String a;
          System.out.println("enter a string ");
           a=sc.nextLine();
          System.out.println("String Length =>"+a.length());

          for(int i=0;i<(a.length()/2);i++)
          {
               char c=a.charAt(i);
               System.out.print(c);
          }
	}
}