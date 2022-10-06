public class Task4
{
  public static void main(String[]args)
  {
    for(int i=40;i<=50;i++)
    {
      int counter=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          counter++;
        }
      }
      if(counter==2)
      {
        System.out.println(i);
      }
    }
  }
}