import java.util.Scanner;
public class Task14
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    if(num<0)
    {
      num=num*(-1);
    }
    System.out.println(num);
    sc.close();
  }
}