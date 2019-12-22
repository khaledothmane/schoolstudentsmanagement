package net.schoolproject.main;

import net.schoolproject.model.Student;
import net.schoolproject.services.IStudentService;
import net.schoolproject.services.IStudentServiceImpl;

import java.util.List;

public class StudentManagementApp {

    public static void main(String[] args) {

        IStudentService studentService = new IStudentServiceImpl();

        List<Student> students1 = studentService.getStudents();

        for (Student student : students1){
            String message = String.format("Student's id is %d and his name is %s and was born in %s",
                    student.getId(),
                    student.getFirstName(),
                    student.getDayOfBirth().toString());
            //String message2 = "String's id is" + student.getId() + " and his name is " + student.getFirstName();
            System.out.println(message);
        }

    }
}
