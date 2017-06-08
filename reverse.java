import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int b=0;
while(n>0)
{
int a=n%10;
b=(b*10)+a;
n=n/10;
}
System.out.print(b);
}
}
