import java.io.*;
import java.util.*;
public class Program5
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a[]=new int[3];
for(int i=0;i<3;i++)
{
a[i]=scan.nextInt();
}
Arrays.sort(a);
System.out.print(a[2]);
}
}
