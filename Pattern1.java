import java.util.Scanner;
class Pattern1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
int row=s.nextInt();
print(c,row);
}
public static void print(char c,int n)
{
for(int i=1;i<=n;i++)
printLine(c,i);
}
public static void printLine(char c,int col)
{
System.out.println(" ");
for(int j=1;j<=col;j++)
System.out.print(c);
}
}