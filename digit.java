import java.util.Scanner;
class Digit
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a digit");

char c=scob.next().charAt(0);
if((c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='10'))
System.out.println("DIGIT");
else System.out.println("NOT A DIGIT");
}
}

