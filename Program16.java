import java.io.*;
import java.util.*;
public class Program16
{
public static void main(String args[])
{
int n=1;
Scanner scan=new Scanner(System.in);
int k=scan.nextInt();
for(int i=1;i<=10;i++)
{
 n=k*i;
System.out.println(k+"x"+i+"="+n);
}
}
}
