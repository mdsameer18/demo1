class Employee
{
int eid;
String ename;
String edept;
void sam(int a,String s1,String s2)
{
eid=a;
ename=s1;
edept=s2;
}
void disp()
{
System.out.println(eid+" "+ename+edept);
}
}
class EmployeeMethod
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.sam(786,"SAMEER","CSE");
e2.sam(111,"JYOTHISH","CIVIL");
e3.sam(566,"KANTHARA","PUJARI");
e1.disp();
e2.disp();
e3.disp();
}
}

