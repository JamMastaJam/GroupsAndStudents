package com.jam.GroupsAndStudents.service;

import com.jam.GroupsAndStudents.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    void addStudent(StudentDTO studentDTO, int groupId);

    List<StudentDTO> getAllStudents();

    StudentDTO getStudent(int id);

    void deleteStudent(int id);
}
