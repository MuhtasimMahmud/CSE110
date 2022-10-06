import java.util.Scanner;
public class Task3
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
    for(int i=a.length-1;i>=0;i--)
    {
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}