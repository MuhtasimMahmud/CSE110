public class Task17
{
  public static void main(String[]args)
  {
    int a=0;
    int b=1;
    System.out.println(a);
    System.out.println(b);
    int sum=a+b;
    int x=1600;
    while((a+b)<x)
    {
      sum=a+b;
      a=b;
      b=sum;
     System.out.println(sum);
    }
  }
}