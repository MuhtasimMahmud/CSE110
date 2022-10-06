import java.util.Scanner;
public class Task7
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me the value of X");
    int x=sc.nextInt();
    System.out.println("Please give me the value of Y");
    int y=sc.nextInt();
    System.out.println("Please give me the value of Z");
    int z=sc.nextInt();
    float s=(x+y+z)/2;
    double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println("The area is="+area);
    sc.close();
  }
}