import java.io.*;
import java.util.*;
public class Program14
{
public static void main(String args[])
{
int fact=1;
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.print(fact);
}
}
