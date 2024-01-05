class WrapperExample
{
public static void main(String args[])
{
byte b=10;
short s=20;
int i=12;
long l=345;
double d=90.0D;
float f=3.45F;
char c='a';
boolean bo=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Double doubleobj=d;
Float floatobj=f;
Character charobj=c;
Boolean booleanobj=bo;

System.out.println("------------------------printing object values ----------------");

System.out.println();
System.out.println("Byte Object:"+byteobj);
System.out.println("Short Object:"+shortobj);
System.out.println("Integer Object:"+intobj);
System.out.println("long Object:"+longobj);
System.out.println("Double Object:"+doubleobj);
System.out.println("Float Object:"+floatobj);
System.out.println("Character Object:"+charobj);
System.out.println("Bolean Object:"+booleanobj);
byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;

System.out.println("----------------------------printing premitive values----------------------");

System.out.println();
System.out.println("byte value:"+bytevalue);

System.out.println("short value:"+shortvalue);
System.out.println("int value:"+intvalue);

System.out.println("long value:"+longvalue);

System.out.println("float value:"+floatvalue);

System.out.println("double value:"+doublevalue);

System.out.println("char value:"+charvalue);
}
}