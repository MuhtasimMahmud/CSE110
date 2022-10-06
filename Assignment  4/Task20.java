import java.util.Scanner;
public class Task20//eita te sesh digit er poreu comma hobe & eta while loop die kora
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int temp=0;
    while(num>0)
    {
      temp=num%10;
      System.out.print(temp+",");
      num=num/10;
    }
    sc.close();
  }
}
