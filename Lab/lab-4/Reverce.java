import java.util.Scanner;
public class Reverce{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
       int a[]=new int[size];
     for (int i=0;i<a.length;i++)
      {
         System.out.print("enter a Element ");
         a[i]=sc.nextInt();
      }

      for(int i=a.length-1;i>=0;i--)
      {
           System.out.println(a[i]);
      } 
	}
}