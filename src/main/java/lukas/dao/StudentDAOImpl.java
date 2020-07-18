package lukas.dao;

import lukas.entity.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDAOImpl implements StudentDAO {

    static List<Student> students = new ArrayList<>();


   static public void print(){
        System.out.println(students);
    }


    @Override
    public boolean save(Student student) {
       return students.add(student);
    }

    @Override
    public void update(Student student) {
        if (students.get(student.getId()-1) == null) {
            students.add(student);
        } else {
            students.set(student.getId()-1, student);
        }
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public Student geById(int id) {
        return students.get(id);
    }
}
