import java.util.Scanner;
public class HoloSquare{
	public static void main (String args[])
	{
          Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int i=0;
		 int j=0;
          for( i=0;n>=i;i++){
        	for( j=0;n>=j;j++)
   	{   
   		if(i==0||j==0||j==n||i==n)
            {
            	System.out.print("*");
            }
          else
          {
          	System.out.print(" ");
          }          
	   }
	  System.out.println();
      
   }
 }
} 