class Circle
{
int square;
void calculate(int sr)
{
square=sr;
}
void calculateArea()
{
System.out.println(3.14*square*square);
}
}
class CircleArea
{
public static void main(String args[])
{
Circle r2=new Circle();
r2.calculate(3);
r2.calculateArea();
}
}