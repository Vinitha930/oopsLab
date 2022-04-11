import java.util.*;
class collegeme
 {
   class staff
    {
      int s_id;
      String s_name;
   
  staff(int id,String name)
   {
      s_id=id;
      s_name=name;
  
  }
 void display()
  {
   System.out.println("staff id is"+s_id);
   System.out.println("staff name  is"+s_name);

  }
   }

static class student
   {
      int rollno;
       String stu_name;
  student(int ro_no,String stud_name)
     {

       rollno=ro_no;
       stu_name=stud_name;
     }
 void display()
  {
       System.out.println("student id is"+rollno);
       System.out.println("student name  is"+stu_name);
  }
   }


 public static void main(String args[])
  {
    
  collegeme obj=new collegeme();
collegeme.staff obj1=obj.new staff(22,"vinu");

  
 
collegeme.student obj3=new collegeme.student(10,"ammu");
obj1.display();
obj3.display();


}
}



