public class Task27
{
  public static void main(String[]args)
  {
    
    int x=0;
    for(int i=1;i<1000;i++)
    {
      int counter=0;
      for(int j=1;j<=i;j++)
      {
        x=i%j;
        if(x==0)
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