import java.io.*;
import java.util.*;
public class Program51
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++)
{
a[i]=scan.nextInt();
}
Arrays.sort(a);
System.out.print(a[1]);
}
}
