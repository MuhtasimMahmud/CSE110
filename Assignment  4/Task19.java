import java.util.Scanner;
public class Task19//eta loop die kora
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int temp=1;
    int product=1;
    for(int i=0;i<num;i++)
    {
      product=temp*10;
      temp=product;
    }
    System.out.println(product);
    sc.close();
  }
}