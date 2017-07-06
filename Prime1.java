# re8
import java.io.*;
import java.util.*;
public class Prime1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c,i,j,flag=0;
    System.out.println("Enter the lower limit");
    a=sc.nextInt();
    System.out.println("Enter the upper limit");
    b=sc.nextInt();
    System.out.println("Enter the prime number limit");
    c=sc.nextInt();
    for(i=a;i<=b;i++)
    {
      for(j=2;j<i;j++)
      {
        if(i%j==0)
        {
          

        flag=0;

         }
      else
      {
        flag=1;
      }
    }
    if(flag==1)
    {
      System.out.println(i);
    }
  }
}
}
