import java.io.*;
import java.util.*;
public class Program8
{
public static void main(String args[])
{
int h,m,sum=0;
Scanner scan=new Scanner(System.in);
String n=scan.nextLine();
h=Integer.parseInt(n);
for(int i=0;i<n.length();i++)
{
m=h%10;
sum=sum+m;
h=h/10;
}
System.out.print(sum);
}
}

