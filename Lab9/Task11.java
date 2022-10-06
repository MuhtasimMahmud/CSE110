import java.util.Scanner;
public class Task11
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int i=0;
    while(i<a.length)
    {
      int flag=0;
      int num=sc.nextInt();
      for(int j=0;j<i;j++)
      {
        if(num==a[j])
        {
          System.out.println("Please give me another number");
          flag=1;
          break;
        }
      }
      if(flag==0)
      {
        a[i]=num;
        i++;
      }
    }
    for(int j=0;j<a.length;j++)
    {
      System.out.print(a[j]+" ");
    }
  }
}