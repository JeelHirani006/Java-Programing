import java.util.Scanner;
public class Pyramid{
	public static void main (String args[])
	{
          Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int i=0;
		 int j=0;
      for( i=0;n>=i;i++){
        	for( j=0;n>=j;j++)
   	{  if(n-i-1-j>=0)
   	   {  

             System.out.print(" ");
   		}
   		else
   		{
   			System.out.print("* ");
   		}
	  }
	  System.out.println();
      
   }
 }
} 