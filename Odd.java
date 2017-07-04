# odd
import java.io.*;
import java.util.*;
public class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int n1,n2;
System.out.println("Enter the range");
n1=sc.nextInt();
n2=sc.nextInt();
for(int i=n1; i<=n2; i++)
{
if(i%2==1)
{
System.out.println(i);
}
}
}
}
