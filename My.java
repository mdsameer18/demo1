class My
{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private String aadhar_no;
public void setCollege_name(String college_name)
{
this.college_name=college_name;
}
public void setCollege_address(String college_address)
{
this.college_address=college_address;
}
public void setAy_start(int ay_start)
{
this.ay_start=ay_start;
}
public void setAy_end(int ay_end)
{
this.ay_end=ay_end;
}
public void setId(int id)
{
this.id=id;
}
public void setStudent_name(String student_name)
{
this.student_name=student_name;
}
public void setCourse_name(String course_name)
{
this.course_name=course_name;
}
public void setAadhar_no(String aadhar_no)
{
this.aadhar_no=aadhar_no;
}
public String getCollege_name()
{
return college_name;
}
public String getCollege_address()
{
return college_address;
}
public int getAy_start()
{
return ay_start;
}
public int getAy_end()
{
return ay_end;
}
public int getId()
{
return id;
}
public String getStudent_name()
{
return student_name;
}
public String getCourse_name()
{
return course_name;
}
public String getAadhar_no()
{
return aadhar_no;
}
}
class Profile
{
public static void main(String args[])
{
My ob=new My();
ob.setCollege_name("MTIET");
ob.setCollege_address("PALAMANER,517408");
ob.setAy_start(2022);
ob.setAy_end(2026);
ob.setId(28044);
ob.setStudent_name("SAMEER");
ob.setCourse_name("CSE");
ob.setAadhar_no("200004762866");
System.out.println("college_name is:"+ob.getCollege_name());
System.out.println("college_address is:"+ob.getCollege_address());
System.out.println("Ay_start is:"+ob.getAy_start());
System.out.println("Ay_end is:"+ob.getAy_end());
System.out.println("Id is"+ob.getId());
System.out.println("Student_name is:"+ob.getStudent_name());
System.out.println("Course_name is:"+ob.getCourse_name());
System.out.println("Aadhar_no is:"+ob.getAadhar_no());
}
}