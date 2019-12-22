package net.schoolproject.dao;

import net.schoolproject.model.Student;

import java.util.LinkedList;
import java.util.List;

public class IStudentDaoJsonimpl implements IStudentDao {

    public List<Student> getStudents() {
        return new LinkedList<>();
    }
}
