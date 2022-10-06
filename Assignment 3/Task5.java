import java.util.Scanner;
public class Task5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a time in seconds");
    int num=sc.nextInt();
    int hours=num/3600;
    int x=num-(hours*3600);
    int minute=x/60;
    int second=(num-((hours*3600)+(minute*60)));
    System.out.println(hours+"hours "+minute+"minute "+second+" second");
    sc.close();
  }
}