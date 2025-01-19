import java.util.Scanner;
public class BinaryShort{
	public static void main (String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i;
		int temp=0;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter a Element ");
            a[i]=sc.nextInt();
        }
            System.out.println("Enter a Element you want to find  ");
            int n=sc.nextInt();
          
          
           int s1=0;
           int s2=(a.length/2);
           int s3=a.length-1;
           
           while(s1<=s3)
           {
           	 if(n==a[s2])
           	 { 
               temp=1;
               break;
           	 }
           	 else if(n<a[s2])      
           	 {        
           	 	    s3=s2;
           	        s2=(s1+s2)/2;
           	 }
           	 else 
           	 {       
           	 	   s1=s2;
           	 	   s2=(s2+s3)/2;
           	 }	
           }

          if(temp==0)
          {
             System.out.println("not match");
          }
          else
          {
             System.out.println("match at index "+s2);
          }
	}
          
}