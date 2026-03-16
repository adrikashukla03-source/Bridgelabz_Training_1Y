import college.student.Student;
import college.faculty.Faculty;

public class Main{
public static void main(String[] args){
Student s=new Student("Arnav",20);
Faculty f=new Faculty("Tanmay","java");

System.out.println("Student Name: " + s.name);
System.out.println("Roll Number: " + s.rollno);

System.out.println("Faculty Name: " + f.name);
System.out.println("Subject: " + f.subject);


}

}