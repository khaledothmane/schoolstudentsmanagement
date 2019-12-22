package net.schoolproject.dao;

import net.schoolproject.model.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class IStudentDaoImpl implements IStudentDao {

    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,
                "Othmane",
                "khaled",
                LocalDate.of(1990, Month.OCTOBER, 4)));
        students.add(new Student(2,
                "Badr",
                "Jabri",
                LocalDate.of(1994, Month.JUNE, 8) ));
        students.add(new Student(3,
                "Soufiane",
                "Tahfaoui",
                LocalDate.of(1993, Month.JANUARY, 01)));
        return students;
    }

}
