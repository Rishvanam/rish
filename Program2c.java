import java.io.*;
import java.util.*;
public class Program2c
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
for(int i=a+1;i<b;i++)
{
int j=i/2;
for(int k=2;k<j;k++)
{
if(i%k==0)
{
count++;
}
}
System.out.print(count);
}
}
}
