import java.util.Scanner;
public class ScoreBord{
	public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
         String t[]=new String[2];
         System.out.println("Enter  team no 1");
         t[0]=sc.nextLine();
         System.out.println("Enter  team no 2");
         t[1]=sc.nextLine();
               int run[][][]=new int[2][][];
               int i;
               int j;
               int k;
        for(i=0;i<2;i++)
        {
            System.out.println("Enter a number of over Team "+t[i]+" played");
                 int temp=sc.nextInt();
                 run[i]= new int [temp][]; 
                for( j=0;j<temp;j++)
                     {
                        System.out.println("Enter a no of ball played  by team "+t[i]+" at "+(j+1)+" over ");
                        int temp1=sc.nextInt();
                        run[i][j]=new int[temp1];
                         for(k=0;k<temp1;k++)
                         {                  
                          System.out.println("Enter a no of run by team "+t[i]+" at "+(j+1)+" over "+(k+1)+" st ball");
                             run[i][j][k]=sc.nextInt();
                         }
                     }
        }
                 int sum[]=new int[2];
                 int extra[]=new int[2];
                 int wicket[]=new int[2];
                
                for(i=0;i<2;i++){
                        System.out.println("team =>"+t[i]);
                        for(j=0;j<run[i].length;j++){
                        System.out.println("Over=>"+j+1);
                        for(k=0;k<run[i][j].length;k++)
                        {   if(run[i][j][k]==-10)
                             {
                                System.out.print("ball=>"+k+1+"run=>1(Whide)");
                                extra[i]++;
                                sum[i]++;
                             }
                             else if(run[i][j][k]==-20)
                             {
                                System.out.print("ball=>"+k+1+"(No ball)");
                                extra[i]++;
                             }
                             else if(run[i][j][k]==-30)
                             {
                                System.out.print("ball=>"+k+1+"(Wicket)");
                                 wicket[i]++;
                             }
                             else
                            {
                                System.out.print("ball=>"+k+1+"run=>"+run[i][j][k]);
                            }
                            
                        }
                    }
                }
                 if(sum[1]>sum[2])
                 {
                    System.out.println("Winner team "+t[1]);
                    System.out.println("Wicket"+wicket[1]+"extra ball==>"+extra[1]);

                 }
                 else 
                 {
                    System.out.println("Winner team "+t[2]);
                    System.out.println("Wicket"+wicket[2]+"extra ball==>"+extra[2]);
                 }

	}
}