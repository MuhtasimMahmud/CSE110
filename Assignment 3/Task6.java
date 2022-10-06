import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int s=sc.nextInt();
    int L=0;
    if(s<100)
    {
      L=(3000-(125*(s*s)));
    }
    else if(s>=100)
    {
      L=(1200)/(4+((s*s)/4900));
    }
    System.out.println(L);
    sc.close();
  }
}