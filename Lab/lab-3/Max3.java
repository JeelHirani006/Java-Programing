import java.util.Scanner;
public class Max3{
	public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 3 number ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int ans=(a>b)?((a>c)?a:b):((b>c)?b:c);
      System.out.println("max="+ans);
      
	}
}