package net.schoolproject.services;

import net.schoolproject.dao.IStudentDao;
import net.schoolproject.dao.IStudentDaoImpl;
import net.schoolproject.dao.IStudentDaoJsonimpl;
import net.schoolproject.model.Student;

import java.util.List;

public class IStudentServiceImpl implements IStudentService {

    @Override
    public List<Student> getStudents() {
        IStudentDao studentDao = new IStudentDaoImpl();
        return studentDao.getStudents();
    }

    @Override
    public List<Student> getJsonStudents() {
        IStudentDao studentDao = new IStudentDaoJsonimpl();
        return studentDao.getStudents();
    }

}
