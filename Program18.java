import java.io.*;
import java.util.*
public class Program18
{
public static void main(String args[])
{
int f1=0,f2=1,f;
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for(int i=1;i<=n;i++)
{
System.out.print(f1+" ");
f=f1+f2;
f1=f2;
f2=f;
}
}
}
