import java.util.Scanner;
public class Task8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me the number of published article");
    int num=sc.nextInt();
    int total_monthly_fees=num*500;
    System.out.println(total_monthly_fees);
    sc.close();
  }
}