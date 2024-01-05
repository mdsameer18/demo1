class Index
{
private String name;
private String std;
private String sec;
private int rollno;
private String address;
public void setName(String name)
{
this.name=name;
}
public void setStd(String std)
{
this.std=std;
}
public void setSec(String sec)
{
this.sec=sec;
}
public void setRollno(int rollno)
{
this.rollno=rollno;
}
public void setAddress(String address)
{
this.address=address;
}
public String getName()
{
return name;
}
public String getStd()
{
return std;
}
public String getSec()
{
return sec;
}
public int getRollno()
{
return rollno;
}
public String getAddress()
{
return address;
}
}
class Book
{
public static void main(String args[])
{
Index ob=new Index();
ob.setName("SAMEER");
ob.setStd("B.TECH");
ob.setSec("CSE.B");
ob.setRollno(45);
ob.setAddress("PALAMANER");
System.out.println("Name is:"+ob.getName());
System.out.println("Studying :"+ob.getStd());
System.out.println("Section is:"+ob.getSec());
System.out.println("ROLL NO is:"+ob.getRollno());
System.out.println("Address is:"+ob.getAddress());
}
}