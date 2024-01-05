import java.util.Scanner;
class Pattern4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
int row=s.nextInt();
printReversePattern(ch,row);
}
public static void printReversePattern(char c,int  n)
{
for (int i=n;i>=1;i--)
{
printLine(c,i);
}
}
public static void printLine(char c,int col)
{
System.out.print("\n");
for(int i=1;i<=col;i++)
System.out.print(c);
}
}



/* ch='*'
row=5
printPattern('*',5)
c='*',n=5
i=1;printLine('',1):c='',col=1;*
i=2;printLine('',2):c='',col=2;**
i=1;printLine('',3):c='',col=3;*
i=1;printLine('',4):c='',col=4;**
i=1;printLine('',5):c='',col=5;***
*/