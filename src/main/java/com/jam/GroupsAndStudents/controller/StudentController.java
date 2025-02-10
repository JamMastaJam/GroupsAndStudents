package com.jam.GroupsAndStudents.controller;

import com.jam.GroupsAndStudents.dto.StudentDTO;
import com.jam.GroupsAndStudents.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody StudentDTO studentDTO, @RequestParam int id) {
        studentService.addStudent(studentDTO, id);
    }

    @GetMapping
    public List<StudentDTO> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

}
