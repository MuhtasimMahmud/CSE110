import java.util.Scanner;
public class Task15
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    if(num>=4 && num<=20)
    {
      if(num>=4 && num<=6)
      {
        System.out.println("Breakfast");
      }
      else if(num>=12 && num<=13)
      {
        System.out.println("Lunch");
      }
      else if(num>=16 && num<=17)
      {
        System.out.println("Snacks");
      }
      else if(num>=19 && num<=20)
      {
        System.out.println("Dinner");
      }
    }
    else
    {
      System.out.println("Wrong time");
    }
    sc.close();
  }
}