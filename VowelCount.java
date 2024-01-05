import java.util.Scanner;
class VowelCount
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
s=s.toLowerCase();
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u')
count++;
}
if(count!=0)
System.out.println(count);
else
System.out.println(count);
}
}