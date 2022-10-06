import java.util.Scanner;
public class Task__20 //eta for loop die korsi
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int counter=0;
    for(int temp=num;temp>0;temp/=10)
    {
      counter++;
    }
    int x=0;
    int counter2=0;
    for(int temp=num;temp>0;temp/=10)
    {
      x=temp%10;
      counter2++;
      System.out.print(x);
      if(counter2!=counter)
      {
        System.out.print(",");
      }
    }
    System.out.println();
    sc.close();
  }
}  