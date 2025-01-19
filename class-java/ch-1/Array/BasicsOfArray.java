public class BasicsOfArray{
	public static void main (String []args){
		int a[]=new int[2];
		a[1]=5;
		System.out.println("0"+a[0]+"1"+a[1]);
		//aolso write like this
        int b[];
        b=new int[3];
        b[2]=5;
        System.out.println(b[2]);
        //stack,string pool,heap
        //new statement data store in heap 
        //without new store in string pool 
        //in string same string not create new creat at same adress 
        // so == check adress same string store at heap and string pool not== (true)
	}
}