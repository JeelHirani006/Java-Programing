import java.util.Scanner;
public class AreaOfRectangle{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length");
		double l=sc.nextDouble();
		System.out.println("Enter a breath");
		double b=sc.nextDouble();
		double ans=l*b;
        System.out.println("area"+ans); 
    }
}