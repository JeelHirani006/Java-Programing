import java.util.Scanner;
class Student{
	int rollno;
	int enrollmentno;
    void Setvalue()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a rollno");
           rollno=sc.nextInt();
         System.out.println("enter a enrollment number");
           enrollmentno=sc.nextInt();
    }  
}
public class Demo{
	public static void main(String [] args){
		//without menthod
           Student a1=new Student();
           a1.rollno=101;
           a1.enrollmentno=111111;
           System.out.println("Rollno a1 "+a1.rollno);
           System.out.println("enrollmentno a1 "+a1.enrollmentno);

           Student a2=new Student();
           a2.rollno=102;
           a2.enrollmentno=100002;
           System.out.println("rollno a2 "+a2.rollno);
           System.out.println("enrollmentno a2 "+a2.enrollmentno);

       //with method    //method call object call vagar na thay
                        //method call objct na attribute par vark karse  
           Student a3=new Student();
           a3.Setvalue();
           Student a4=new Student();
           a4.Setvalue();
             
	}
}