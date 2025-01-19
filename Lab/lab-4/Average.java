import java.util.Scanner;
public class Average{
	public static void main (String [] args){
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a Size");
    int size=sc.nextInt();
    int a[]=new int[size];
    int sum=0;
    for (int i=0;i<a.length;i++)
     {
         System.out.print("enter a Element ");
         a[i]=sc.nextInt();
     } 

       for (int i=0;i<a.length;i++)
     {
        sum=sum+a[i];
     } 

     double avg=sum/(double)a.length;
     System.out.print("avg=>"+avg);
  }
}