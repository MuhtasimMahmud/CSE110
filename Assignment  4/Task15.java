import java.util.Scanner;
public class Task15
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    for(int i=0;i<20;i++)
    {
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    sum=sum+num;
    System.out.println(sum);
    }
    sc.close();
  }
}