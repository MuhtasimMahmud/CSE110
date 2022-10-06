import java.util.Scanner;
public class Task18
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int counter=0;
    while(num>0)
    {  
      num=num/10;
      counter++;
    }
    System.out.println(counter);
    sc.close();
  }
}