import java.io.*;
import java.util.*;
public class Program15
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int s=scan.nextInt();
for(int i=n+1;i<s;i++)
{
int j=i/2;
for(int k=2;k<=j;k++)
{
if((i%k)==0)
count++;
}
if(count==0)
System.out.print(i+" ");
count=0;
}
}
}
