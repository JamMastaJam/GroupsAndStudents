package com.jam.GroupsAndStudents.service;

import com.jam.GroupsAndStudents.dto.GroupDTO;
import com.jam.GroupsAndStudents.dto.StudentDTO;
import com.jam.GroupsAndStudents.entity.Group;
import com.jam.GroupsAndStudents.entity.Student;
import com.jam.GroupsAndStudents.mapper.GroupMapper;
import com.jam.GroupsAndStudents.mapper.StudentMapper;
import com.jam.GroupsAndStudents.repository.GroupRepository;
import com.jam.GroupsAndStudents.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final GroupService groupService;
    private final GroupMapper groupMapper;
    private final GroupRepository groupRepository;


    @Override
    public void addStudent(StudentDTO studentDTO, int groupId) {
        Group group = null;
        Student student = new Student();
        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if (groupOptional.isPresent()) {
            group = groupOptional.get();

            student.setAcceptDate(studentDTO.getAcceptDate());
            student.setFullName(studentDTO.getFullName());
            student.setGroup(group);
//            student.getGroup().setId(group.getId());
            Student savedStudent = studentRepository.save(student);
            group.getStudents().add(savedStudent);
//            groupOptional.get().getStudents().add(savedStudent);
            System.out.println(savedStudent.getGroup().getId());
        }


    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentMapper.toDTOList(studentRepository.findAll());
    }

    @Override
    public StudentDTO getStudent(int id) {
        return studentRepository.findById(id)
                .map(studentMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Student not found"));
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }


}
