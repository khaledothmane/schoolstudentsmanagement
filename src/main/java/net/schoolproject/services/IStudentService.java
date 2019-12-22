package net.schoolproject.services;

import net.schoolproject.model.Student;

import java.util.List;

public interface IStudentService {

    public List<Student> getStudents();

    public List<Student> getJsonStudents();
}
