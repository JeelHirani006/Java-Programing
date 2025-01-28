import java .util.Scanner;
class Mobile{
String name;
int price;

         public Mobile()
         {
         	Scanner sc=new Scanner(System.in);
           System.out.println("Enter a name ");
           name=sc.nextLine();
           System.out.println("Enter a price ");
           price=sc.nextInt();  
         }
}
public class Constructer{
	public static void main(String [] args){
       Mobile a=new Mobile();    
       Mobile b=new Mobile();    
	}
}