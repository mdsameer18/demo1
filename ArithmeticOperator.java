import java.util.Scanner;
public class ArithmeticOperator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
double num1=sc.nextDouble();
System.out.println("Eneter the second number:");
double num2=sc.nextDouble();
double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double division=num1/num2;
double quotient=num1%num2;
System.out.println("The sum of two numbers is:"+sum);
System.out.println("The difference of two numbers is:"+difference);
System.out.println("The product of two numbers is:"+product);
System.out.println("The division of two numbers is:"+division);
System.out.println("The quotient of two numbers is:"+quotient);
}
}