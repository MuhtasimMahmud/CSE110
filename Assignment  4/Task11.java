import java.util.Scanner;
public class Task11
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int counter=0;
    for(int i=0;i<10;i++)
    {
      System.out.println("please give me a number");
      int num=sc.nextInt();
      if(num%2==0)
      {
        sum=sum+num;
        counter++;
      }
    }
    int avg=sum/counter;
    System.out.println("Total="+sum);
    System.out.println("Average="+avg);
    sc.close();
  }
}