import java.io.*;
import java.util.*;
public class Program1
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
if(n==0)
System.out.print("zero");
if(n>0)
{
if(n%2==0)
System.out.print("even");
else
System.out.print("odd");
}
}
}
