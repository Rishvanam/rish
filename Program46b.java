import java.io.*;
import java.util.*;
public class Program46b
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int k=1;
  for(int i=1;i<=20;i++)
  {
    k=a*i;
    System.out.println(a+"x"+i+"="+k);
}
}
}
