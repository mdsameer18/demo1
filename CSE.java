class CSE
{
public int x;
public void setX(int a)
{x=a;}
}
class ECE
{
public static void main(String args[])
{
System.out.println("GOOD MORNING");
CSE ob=new CSE();
ob.setX(10);
System.out.println("X:"+ob.x);
}
}