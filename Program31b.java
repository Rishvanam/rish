import java.io.*;
import java.util.*;
public class Program31b
{
public static void main(String args[])
{
int count=0;
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(Character.isLetter(c))
{
count++;
}
}
System.out.print(count);
}
}
