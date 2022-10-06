import java.util.Scanner;
public class Task28
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        sum=sum+i;
      }
    }
    System.out.println(sum);
    sc.close();
  }
}  