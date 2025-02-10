package com.jam.GroupsAndStudents.service;

import com.jam.GroupsAndStudents.dto.GroupDTO;

import java.util.List;

public interface GroupService {

    GroupDTO addGroup(GroupDTO groupDTO);

    List<GroupDTO> getAllGroups();

    GroupDTO getGroup(int id);

    void deleteGroup(int id);
}
