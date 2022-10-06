import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int sum=0;
    int y=0;
    for(int i=1;i<=num;i++)
    {
      if(i%2!=0)
      {
        y=(i*i);
        sum=sum+y;
      }
      else
      {
        y=(-1)*(i*i);
        sum=sum+y;
      }
    }
    System.out.println("Y="+sum);
    sc.close();
  }
}