import java.util.Scanner;
public class Task4
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int min=num;
    int sum=0;
    int counter=0;
    if(num%2==0)
    {
      sum=num;
      counter++;
    }
    for(int i=1;i<20;i++)
    {
      System.out.println("Give me another number");
      int num2=sc.nextInt();
      if(num2<min)
      {
        min=num2;
      }
      if(num2%2==0)
      {
        sum=sum+num2;
        counter++;
      }
    }
    int avg=sum/counter;
    System.out.println("Minimum number="+min);
    System.out.println("Average="+avg);
    sc.close();
  }
}