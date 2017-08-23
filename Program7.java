import java.io.*;
import java.util.*;
public class Program7
{
public static void main(String args[])
{
int n,sum=0,m;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
while(n>0)
{
m=n%10;
sum=sum+m;
n=n/10;
}
System.out.print(sum);
}
}
