import java.io.*;
import java.util.*;
public class Program36
{
public static void main(String args[])
{
int temp;
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
temp=a;
a=b;
b=temp;
System.out.print(a+" "+b);
}
}
