public class StringComper {
	public static void main(String[] args) {
		
		String a="jeel";
		String b= new String();    // all point variable in stack object and constructor have no name but adress point var store adres
		
	    	b="jeel";             //when reassignment  store  a  at ( string pool address) 
		   if(a==b)              //when in constructor not equal store string in  heap                                                
          {
        	  System.out.println("match");
          }
          else 
          {
			System.out.println("not match");
		  }
		   
	}
}
