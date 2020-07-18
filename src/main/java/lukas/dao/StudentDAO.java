package lukas.dao;

import lukas.entity.Student;

public interface StudentDAO {
    boolean save(Student student);

    void update(Student student);

    void delete(Student student);

    Student geById(int id);
}
