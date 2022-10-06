import java.util.Scanner;
public class Task9
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Please give me a number");
      a[i]=sc.nextInt();
    }
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int counter=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]==num)
      {
        System.out.println("Yes");
        counter=1;
        break;
      }
    }
    if(counter==0)
     {
        System.out.println("No");
     }
    sc.close();
  }
}