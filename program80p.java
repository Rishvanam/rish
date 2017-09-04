import java.io.*;
import java.util.*;
public class Program80p
{
public static void main(String args[])
{
int i,j,sum=0;
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int s[]=new int[a];
int s1[]=new int[a];
for(i=0;i<s.length;i++)
{
s[i]=scan.nextInt();
}
Arrays.sort(s);
for(i=0;i<s1.length;i++)
{
s1[i]=scan.nextInt();
}
Arrays.sort(s1);
sum=((s[s.length-1])+s1[0]);
System.out.print(sum);
}
}


