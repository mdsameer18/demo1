class Rectangle
{
int length;
int width;
void calculate(int l,int w)
{
length=l;
width=w;
}
void calculateArea()
{
System.out.println(length*width);
}
}
class RectangleArea
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.calculate(10,20);
r2.calculate(3,15);
r1.calculateArea();
r2.calculateArea();
}

}