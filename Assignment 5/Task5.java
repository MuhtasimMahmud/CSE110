public class Task5
{
  public static void main(String[]args)
  {
    int a[]=new int[]{50,30,20,10,40};
    int max=1;
    for(int i=2;i<a.length;i++)
    {
      if(a[i]>a[max])
      {
        max=i;
      }
    }
    int temp=a[1];
    a[1]=a[max];
    a[max]=temp;
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]+" ");
    }
  }
}