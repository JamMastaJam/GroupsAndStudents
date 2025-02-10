package com.jam.GroupsAndStudents.mapper;

import com.jam.GroupsAndStudents.dto.StudentDTO;
import com.jam.GroupsAndStudents.entity.Student;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO toDTO(Student student);

    List<StudentDTO> toDTOList(List<Student> students);

    Student toEntity(StudentDTO studentDTO);

    List<Student> toEntityList(List<StudentDTO> studentDTOS);
}
