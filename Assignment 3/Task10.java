import java.util.Scanner;
public class Task10
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me the name of your favorite car");
    String name=sc.nextLine();
    for(int i=0;i<4;i++)
    {
      System.out.println(name);
    }
    sc.close();
  }
}