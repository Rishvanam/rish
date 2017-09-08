import java.io.*;
import java.util.*;
public class Program6hunt
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int a1[]=new int[a];
for(i=0;i<a1.length;i++)
{
a1[i]=scan.nextInt();
}
for(i=0;i<a1.length;i++)
{
for(j=i+1;j<a1.length;j++)
{
if(a1[i]==a1[j])
String s=s+valueOf(a1[i]);}}
System.out.print(s.charAt(0));
}
}
