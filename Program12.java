import java.io.*;
import java.util.*;
public class Program12
{
public static void main(String args[])
{
int n,count=0;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
for(int i=2;i<n/2;i++)
{
if(n%i==0)
count++;
}
if(count==0)
System.out.print("prime number");
else
System.out.print("not a prime number");
}
}

