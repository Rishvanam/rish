import java.io.*;
import java.util.*;
public class Program40b
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++)
{
a[i]=scan.nextInt();
}
Arrays.sort(a);
System.out.print(a[9]);
}
}
