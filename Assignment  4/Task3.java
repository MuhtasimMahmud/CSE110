import java.util.Scanner;
public class Task3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int max=num;
    int min=num;
    int avg=num;
    int sum=num;
    for(int i=1;i<20;i++)
    {
      System.out.println("Please give me a number");
      int num2=sc.nextInt();
      if(num2>max)
      {
        max=num2;
      }
      if(num2<min)
      {
        min=num;
      }
      sum=sum+num2;
    }
    avg=sum/20;
    System.out.println("Maximum number="+max);
    System.out.println("Minimum number="+min);
    System.out.println("Average="+avg);
    sc.close();
  }
}