public class Task2
{
  public static void main(String[]args)
  {
    int a[]=new int[]{10,30,20,50,40};
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
      sum=sum+a[i];
    }
    int avg=sum/a.length;
    int counter=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>avg)
      {
        counter++;
      }
    }
    System.out.println(counter+" students are better than average");
    System.out.println("They received following marks");
    for(int i=0;i<a.length;i++)
    {
      if(a[i]>avg)
      {
        System.out.println(a[i]);
      }
    }
  }
}