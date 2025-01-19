import java.util.Scanner;
public class Mark{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks ");
           double a=sc.nextDouble();
           double b=sc.nextDouble();
           double c=sc.nextDouble();
           double d=sc.nextDouble();
           double e=sc.nextDouble();
           double per=(a+b+c+d+e)/5;
           if(per>=60)
           {
           	System.out.println("Firstclass");
           }
           else if(per>=50)
           {
           	System.out.println("Secound class");
           }
           else if(per>=40)
           {
              System.out.println("third class");
           }
           else {
                System.out.println("Fail");
           } 
	}
}