import java.util.Scanner;
public class Linear{
	public static void main (String [] args ){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a array size ");

         int size,i;
         size=sc.nextInt();
         int a[]=new int[size];

         for(i=0;i<a.length;i++)
         {
         	System.out.println("enter a element");
            a[i]=sc.nextInt();
         }

         System.out.println("enter a number you want to short");
         int n=sc.nextInt();

        boolean flag=false;
        for(i=0;i<a.length;i++)
        {
           if (a[i]==n)
           {
           	 System.out.println("match at index"+i);
                flag=true;
           	 System.out.println("You want to search after first acurance press enter a 1");
               int t=sc.nextInt();
                if(t!=1)
                {
                   break;  
                } 	
           }
        }

        if (flag==false)
        {
           	 System.out.println(" not Match element ");
        }
	}
}