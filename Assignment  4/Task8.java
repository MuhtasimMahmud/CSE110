public class Task8
{
  public static void main(String[]args)
  {
    int sum=0;
    for(int i=1;i<=600;i++)
    {
      if(i%7==0)
      {
        sum=sum+i;
      }
      else if(i%9==0)
      {
        sum=sum+i;
      }
    }
    System.out.println(sum);
  }
}