import java.util.Scanner;
public class Task8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int counter=0;
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Please give me a number");
      a[i]=sc.nextInt();
      if(a[i]%2==0)
      {
        counter++;
      }
    }
    int b[]=new int[counter];
    int temp=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]%2==0)
      {
        b[temp++]=a[i];
      }
    }
    for(int i=0;i<b.length;i++)
    {
      System.out.println(b[i]+" ");
    }
  }
}