package com.kamil.demo.dao;

import com.kamil.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {
    int insertNewStudent(UUID id, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudent(UUID studentId, Student studentUpdate);

    int deleteStudentById(UUID studentId);
}
