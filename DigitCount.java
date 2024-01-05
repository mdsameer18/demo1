import java.util.Scanner;
class VowelCount
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='c'||s.charAt(i)=='d'|| s.charAt(i)=='e'||s.charAt(i)=='f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i'||s.charAt(i)=='j')
count++;
}
if(count!=0)
System.out.println(count);
else
System.out.println(count);
}
}