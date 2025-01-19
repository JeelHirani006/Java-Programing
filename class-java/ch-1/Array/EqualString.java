public class EqualString{
	public static void main (String[]args){
		String a[]=new String[1];
		String b[]={"hi"};
		a[0]="hi";
		if(a==b)
		{
			System.out.println("match");
		}
		else
		{
             System.out.println("not match"); 
		}
		     //stack,string pool,heap
        //new statement data store in heap 
        //without new store in string pool 
        //in string same string not create new creat at same adress 
        // so == check adress same string store at heap and string pool not== (true)
	}
}