import java.util.Scanner;
class Subtraction
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();
int sub=num1-num2;
System.out.println("The sum is:");
System.out.println(num1+"-"+num2+"="+sub);
}
}