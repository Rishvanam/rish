import java.io.*;
import java.util.*;
public class Program392c
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
int s=scan.nextInt();
if(s%2==0)
{
int r=s/2;
for(int i=1;i<=r;i++)
{
if(r==Math.pow(2,i))
{
count++;
}}
if(count!=0)
{
System.out.print("true");
}
if(count!=0)
{
System.out.print("true");
}
if(count==0)
{
System.out.print("false");
}
}
if(s%2!=0)
{
System.out.print("false");
}
}
}
