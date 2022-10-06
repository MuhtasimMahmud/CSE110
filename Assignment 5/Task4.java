public class Task4
{
  public static void main(String[]args)
  {
    int a[]=new int[]{10,30,20,50,40};
    int max=0;
    for(int i=1;i<a.length;i++)
    {
      if(a[i]>a[max])
      {
        max=i;
      }
    }
    int temp=a[0];
    a[0]=a[max];
    a[max]=temp;
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]+" ");
    }
  }
}