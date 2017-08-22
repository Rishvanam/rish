import java.io.*;
import java.util.*;
public class Program2
{
public static void main(String args[])
{
char n;
Scanner scan=new Scanner(System.in);
String str=new String();
n=str.charAt(0);
if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
System.out.print("vowel");
else
System.out.print("consonant");
}
}
