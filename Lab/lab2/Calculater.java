import java.util.Scanner;
public class Calculater {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        double a=sc.nextDouble();
        System.out.println("enter a number");
        double b=sc.nextDouble();
         System.out.println("enter a sigan");
         sc.nextLine();
         String s=sc.nextLine();
         double ans;
         if(s.equals("+"))
         {
         	ans=a+b;
         	System.out.println("ans"+ans);
         }
         else if(s.equals("-"))
         {
         	ans=a-b;
         	System.out.println("ans"+ans);
         }
         else if(s.equals("*"))
         {
         	ans=a*b;
         	System.out.println("ans"+ans);
         }
         else if(s.equals("/"))
         {
         	ans=a/b;
         	System.out.println("ans"+ans);
         } 
	}
}