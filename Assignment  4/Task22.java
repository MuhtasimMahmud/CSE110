import java.util.Scanner;
public class Task22
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String a[]=new String [] {"zero","one","two","three","four","five","six","seven","eight","nine"};
    System.out.println("Please give me a number");
    int num=sc.nextInt();
    System.out.print(a[num]);
    sc.close(); 
  }
}