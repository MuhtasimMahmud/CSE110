import java.util.Scanner;
public class Task2
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    if(num<=100 && num>=0)
    {
      if(num>=90  )
      {
        System.out.println("A");
      }
      else if(num>=80 && num<=89)
      {
        System.out.println("B");
      }
      else if(num>=70 && num<=79)
      {
        System.out.println("C");
      }
      else if(num>=60 && num<=69)
      {
        System.out.println("D");
      }
      else if(num>=50 && num<=59)
      {
        System.out.println("E");
      }
      else if(num<50)
      {
        System.out.println("F");
      }
    }
    else
    {
      System.out.println("Wrong input");
    }
    sc.close();
  }
}