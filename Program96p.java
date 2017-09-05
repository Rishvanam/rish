import java.io.*;
import java.util.*;
public class Program96p
{
public static void main(String args[])
{
int fd,ld,s;
Scanner scan=new Scanner(System.in);
s=scan.nextInt();
ld=s%10;
while(s>10)
{
s=s/10;
}
fd=s;
System.out.print(fd+ld);
}
}
