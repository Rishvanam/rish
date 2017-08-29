import java.io.*;
import java.util.*;
public class Program17
{
public static void main(String args[])
{
int m,sum=0;
Scanner scan=new Scanner(System.in);
for(int i=1;i<=15;i++)
{
m=i%2;
sum=sum+m;
i=i/2;
}
System.out.print(sum);
}
}
