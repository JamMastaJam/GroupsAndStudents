package com.jam.GroupsAndStudents.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "groups")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private int id;

    @Column(name = "group_number", unique = true)
    private String groupNumber;

    @OneToMany(mappedBy = "group")
    private List<Student> students;

}
