class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return id;
}
public String getName(){
return name;
}
}
class CSE
{
public static void main(String args[])
{
Student ob=new Student();
ob.setId(28044);
ob.setName("SAMEER");
System.out.println("Id is:"+ob.getId());
System.out.println("Name is:"+ob.getName());
}
}