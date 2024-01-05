import java.util.Scanner;
class If
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value of i");
int i=sc.nextInt();
System.out.println("enter a value of j");
int j=sc.nextInt();
if(j==0)
System.out.println("Error Occured");
else
System.out.println(i+" divided by "+j+" "+" is:"+(i/j));
i=i+j;
}
}