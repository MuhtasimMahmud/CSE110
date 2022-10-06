import java.util.Scanner;
public class Task_19 //eta math.pow die kora
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    double x=(Math.pow(10,num));
    System.out.println(x);
    sc.close();
  }
}