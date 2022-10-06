import java.util.Scanner;
public class Task13
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int a=sc.nextInt();
    System.out.println("Please give me a number");
    int b=sc.nextInt();
    System.out.println("Please give me a number");
    int c=sc.nextInt();
    System.out.println("Please give me a number");
    int d=sc.nextInt();
    System.out.println("Before exchanging a="+a);
    System.out.println("Before exchanging b="+b);
    System.out.println("Before exchanging c="+c);
    System.out.println("Before exchanging d="+d);
    int x=a;
    int y=b;
    int z=c;
    int i=d;
    a=y;
    b=z;
    c=i;
    d=x;
    System.out.println("After exchanging a="+a);
    System.out.println("After exchanging b="+b);
    System.out.println("After exchanging c="+c);
    System.out.println("Before exchanging d="+d);
    sc.close();
  }
}