class ForSum
{
public static void main(String args[])
{
int sum=0;
for(int i=0;i<=100;i=i+5)
{
System.out.print(i+"+");
sum+=i;
}
System.out.println("\b"+"="+sum);
}
}