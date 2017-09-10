import java.io.*;
import java.util.*;
public class Program60b
{
public static void main(String args[])
{
int i,sum=0;
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int a1[]=new int[a];
for(i=0;i<a1.length;i++)
{
a1[i]=scan.nextInt();
}
Arrays.sort(a1);
sum=a1[i-1]+a1[i-2];
System.out.print(sum);
}
}

