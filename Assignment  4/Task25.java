import java.util.Scanner;
public class Task25
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int counter=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        counter++;
      }
    }
    System.out.print("The number is divisible by "+counter+" numbers" );
    sc.close();
  }
}