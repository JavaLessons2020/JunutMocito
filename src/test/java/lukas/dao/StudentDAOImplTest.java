package lukas.dao;

import lukas.entity.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StudentDAOImplTest {

    StudentDAOImpl studentDAO = spy(StudentDAOImpl.class);
    Student student;

    @Before
    public void createStudent(){
       student = new Student(1, "Ivan", 30);
    }

    @Test
    public void saveIfTrue() {
        when(studentDAO.save(student)).thenReturn(true);
        studentDAO.save(student);
        System.out.println(StudentDAOImpl.students);
        assertTrue(studentDAO.save(student));
    }

    @Test
    public void saveIfFalse() {
        when(studentDAO.save(student)).thenReturn(true);
        studentDAO.save(student);
        System.out.println(StudentDAOImpl.students);
        assertTrue(studentDAO.save(student));
    }

    @Test(expected = NullPointerException.class)
    public void saveIfNull() {
        when(studentDAO.save(student)).thenReturn(null);
        //studentDAO.save(student);
//        System.out.println(StudentDAOImpl.students);
        assertTrue(studentDAO.save(student));
    }

    @Test
    public void geById() {
        studentDAO.geById(student.getId());
    }
}