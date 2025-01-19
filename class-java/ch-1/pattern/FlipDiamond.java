 import java.util.Scanner;
public class FlipDiamond{
  public static void main (String args[])
  {
          Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int i=0;
     int j=0;
     for( i=0;n>=i;i++){
          for( j=0;n>=j;j++)
    {
              if(i<=j)
              {
                   System.out.print("* ");
              }    
              else 
              {
                  System.out.print(" ");
              }    
           
  }
    System.out.println();
      
   }
      for( i=0;n>=i;i++){
          for( j=0;n>=j;j++)
    {
              if((n-i-j-1)>=0)
              {
                   System.out.print(" ");
              }    
              else 
              {
                  System.out.print("* ");
              }    
           
  }
    System.out.println();
      
   }
    
 }
} 