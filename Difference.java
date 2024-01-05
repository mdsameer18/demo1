import java.util.Scanner;
class Difference
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first positive integer:");
int num1=sc.nextInt();
System.out.println("Enter the second positive integer:");
int num2=sc.nextInt();
int difference=Math.abs(num1-num2);
System.out.println("The difference between" + num1 + "and" + num2 + "is:" + difference);
sc.close();
}
}