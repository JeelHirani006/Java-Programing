import java.util.Scanner;
public class HoloTriangle{
	public static void main (String args[])
	{
          Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int i=0;
		 int j=0;
    for( i=0;n>=i;i++) 
    {
        	for( j=0;n>j;j++)
   	  {
          
          
             if((n-i-j-1)<0)
             {
             	if(i+j==n||j==n-1||i==1||i==n)	
             	{
                  System.out.print("* ");
               }
             
               else 
               {
             	 System.out.print("  ");
               }
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