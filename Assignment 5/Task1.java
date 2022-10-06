public class Task1
{
  public static void main(String[]args)
  {
    int a[]=new int []{10,30,20,50,40};
    int max=a[0];
    int min=a[0];
    int sum=a[0];
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
      }
    }
    for(int i=1;i<a.length;i++)
    {
      if(a[i]<min)
      {
        min=a[i];
      }
    }
    for(int i=1;i<a.length;i++)
    {
      sum=sum+a[i];
    }
    int avg=sum/(a.length);
    System.out.println("Highest mark is="+max);
    System.out.println("Lowest mark is="+min);
    System.out.println("Average mark is="+avg);
  }
}
