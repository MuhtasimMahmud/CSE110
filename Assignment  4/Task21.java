import java.util.Scanner;
public class Task21
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    double num=sc.nextDouble();
    int counter=0;
    for(double i=num;i>0;i/=10)
    {
      counter++;
    }
    double x=0;
    while(num>0)
    {
      x=num/(Math.pow(10,counter-1));
      counter++;
      System.out.print(x+" ");
      num=num%(Math.pow(10,counter-1));
      counter++;
    }
    sc.close();
  }
}