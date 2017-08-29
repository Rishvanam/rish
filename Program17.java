import java.io.*;
import java.util.*;
public class Program17
{
public static void main(String args[])
{
int sum=0,n=0;
Scanner scan=new Scanner(System.in);
for(int i=1;i<=15;i++)
{
sum=sum+i;
}
System.out.println("sum of numbers is"+"="+sum);
  for(int i=15;i<=45;i++)
  {
    if((i%2)!=0)
    {
      n=n+i;
}
}
  System.out.println("sum of odd numbers is"+"="+n);
}
}
