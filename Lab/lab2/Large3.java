import java.util.Scanner;
public class Large3{
public static void main (String args[]){
      Scanner  sc=new Scanner(System.in);
      System.out.println("enter a three number");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>b)
      {
      	if(a>c)
      		{
         	 System.out.println("Large no="+a);   
      		}
         	else{
         	System.out.println("Large no="+b);
         	}
      }
      else
         { 

        	if(b>c)
            {
            	System.out.println("Large no="+b);
            }

             else 
             {
             	System.out.println("Large no="+c);
             }
       }

   }
}
      