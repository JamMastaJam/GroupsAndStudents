package com.jam.GroupsAndStudents.repository;

import com.jam.GroupsAndStudents.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
