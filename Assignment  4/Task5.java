import java.util.Scanner;
public class Task5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      sum=sum+(i*i*i);
    }
    System.out.println("Y="+sum);
    sc.close();
  }
}