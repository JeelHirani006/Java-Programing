import java.util.Scanner;
public class Vowel{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Character ");
		String s=sc.nextLine();
	    char a=s.charAt(0);
       if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
       {
       	System.out.print("given charecter is vowel ");
       }
       else 
       {
       	System.out.print("given charecter is not vowel ");
       }
	}
}