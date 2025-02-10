package com.jam.GroupsAndStudents.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    @Column(name = "accept_date")
    private String acceptDate;

    @Column(name = "full_name")
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
