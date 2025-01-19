import java.util.Scanner;
public class Voval{
	public static void main (String []args){
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.print("Enter a string ");
		a=sc.nextLine();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<(a.length());i++)
        {
                 char c=a.charAt(i);
                 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                 {
                       vowel++;        
                 }
                 else if(c!=' ')
                 {
                        consonant++;   
                 }

        }
                 System.out.println("no of vowel==>"+vowel);
                 System.out.println("no of consonant==>"+consonant);
	}
}