import java.util.Scanner;
public class Task_20//eita te sesh digit er pore ar comma hobe na & eta while loop die kora
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int counter=0;
    for(int i=num;i>0;i/=10)
    {
      counter++;
     
    }
    int temp=0;
    int counter2=0;
    while(num>0)
    {
      temp=num%10;
      System.out.print(temp);
      counter2++;
      if(counter2!=counter)
      {
        System.out.print(",");
      }
      num=num/10;
    }
    System.out.println();
    sc.close();
  }
}