import java.util.Scanner;
public class AssendingOrder{
	public static void main (String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i,j;
		int temp,temp1;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter a Element ");
            a[i]=sc.nextInt();
        }


        for(i=0;i<a.length;i++)
        {     
        	temp1=a[i];
        	for(j=i+1;j<a.length;j++)
        	{
                 if(temp1>a[j])
                 {    
                 	temp1=a[j];
                 	temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                 }             
        	}
        	
        }

        for(i=0;i<a.length;i++)
        {  
        	System.out.println(a[i]);
        }
	}
}