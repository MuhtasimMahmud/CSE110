import java.util.Scanner;
public class Task14
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number without zero");
    int num=sc.nextInt();
    int product=1;
    for(int i=0;i<num;i++)
    {
      System.out.println("Please give me a number");
      int num2=sc.nextInt();
      product=product*num2;
    }
    System.out.println(product);
    sc.close();
  }
}