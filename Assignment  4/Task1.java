import java.util.Scanner;
public class Task1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me the name of your favorite car");
    String name=sc.nextLine();
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    for(int i=0;i<num;i++)
    {
      System.out.println(name);
    }
    sc.close();
  }
}