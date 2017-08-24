import java.io.*;
import java.util.*;
public class Program13
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int s=scan.nextInt();
int r=scan.nextInt();
for(int i=s+1;i<r;i++)
{
if(i%2==0)
System.out.print(i+" ");
}
}
}
