public class Additionfloatingnumber{
	public static void main (String []args){
	      double a=0.1;
	      double b=0.3;
	      double c=a+b;
	      System.out.println(c);
	      if(c==0.3) // in folatig number round off problrm (prisison/accuracy)  //so not exet 0.3 but near it 
	      {
	      	System.out.println("match");
	      }
	      else
	      {
	      		System.out.println(" not match");
	      }
	}
}