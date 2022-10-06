import java.util.Scanner;
public class Task30
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int n1=sc.nextInt();
    System.out.println("Please give me a number");
    int n2=sc.nextInt();
    int counter2=0;
    int counter4=0;
    for(int i=n1;i<=n2;i++)
    {
      int counter=0;
      int sum=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          counter++;
        }
      }
      if(counter==2)
      {
        counter2++;
      }
      for(int j=1;j<i;j++)
      {
        if(i%j==0)
        {
          sum=sum+j;
        }
      }
      if(sum==i)
      {
        counter4++;
      }
    }
    System.out.println(counter2+" prime number");
    System.out.println(counter4+" perfect number");
    sc.close();
  }
}