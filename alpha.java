import java.util.Scanner;
class Alpha
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c>='A'&&c<='z')||(c>='a'&&c<='z'))System.out.println("YES");
else System.out.println("NO");
}
}
