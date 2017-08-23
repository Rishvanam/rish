import java.io*.;
import java.util.*;
public class Program3
{
public static void main(String args[])
{
int n;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
if(n%4==0)
System.out.print("leap year");
else
System.out.print("not a leap year");
}
}
