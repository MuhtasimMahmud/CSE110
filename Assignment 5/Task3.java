public class Task3
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
    System.out.println("Largest number is "+a[max]);
    System.out.println("Largest number was found at location "+max);
  }
}