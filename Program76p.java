import java.io.*;
import java.util.*;
public class Program76p
{
public static void main(String args[])
{
int i,c=0,d=0,r=0,s1=0;
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int s[]=new int[a];
for(i=0;i<s.length;i++)
{
s[i]=scan.nextInt();
}
for(i=0;i<s.length;i++)
{
if(s[i]%2==0)
{
c=s[i];
s1++;
}
if(s[i]%2!=0)
{
d=s[i];
r++;
}
}
if(r==1)
{
System.out.print(d);
}
else
{
System.out.print(c);
}
}
}
