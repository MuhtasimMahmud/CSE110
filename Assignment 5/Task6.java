import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    int a[]=new int[num];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Please give me a number");
      a[i]=sc.nextInt();
    }
    int max=0;
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>a[max])
      {
        max=i;
      }
    }
    int temp=a[a.length-1];
    a[a.length-1]=a[max];
    a[max]=temp;
    for(int j=0;j<a.length;j++)
    {
      System.out.print(a[j]+" ");
    }
    sc.close();
  }
}