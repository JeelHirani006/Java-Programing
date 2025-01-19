import java.util.Scanner;
public class Pelidrom{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int temp=n;
		int temp2=0;
		int a=0;
		for(int i=0;temp!=0;i++)
		{

         temp2=temp%10;
          a=a*10+temp2;
          temp=temp/10;
		}
		if(a==n)
		{	
		  System.out.println("number is pelidrome");
	    }
	    else 
	    {
             System.out.println("number is not pelidrome");
	    }
	}
}