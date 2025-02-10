package com.jam.GroupsAndStudents.repository;

import com.jam.GroupsAndStudents.dto.StudentDTO;
import com.jam.GroupsAndStudents.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    /**
     * @param student
     * @param id
     */
    default void save(Student student, int id) {

    }
}
