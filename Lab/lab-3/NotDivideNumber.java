import java.util.Scanner;
public class NotDivideNumber{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int a=sc.nextInt();
        int i;
        int flag=0;
        for(i=2;i<=a/2;i++)
        {
           if(a%i!=0)
           {
           	 flag=1;  
           	 break;
           }
        }
        if(flag==1)
       { 	
        System.out.print("not prime ");
       }
        else
        {
          System.out.print("prime ");
        }

	}
}