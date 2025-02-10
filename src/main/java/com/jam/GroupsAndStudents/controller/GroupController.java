package com.jam.GroupsAndStudents.controller;

import com.jam.GroupsAndStudents.dto.GroupDTO;
import com.jam.GroupsAndStudents.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping
    public GroupDTO addGroup(@RequestBody GroupDTO groupDTO) {
        return groupService.addGroup(groupDTO);
    }

    @GetMapping
    public List<GroupDTO> getAllGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    public GroupDTO getGroup(@PathVariable int id) {
        return groupService.getGroup(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable int id) {
        groupService.deleteGroup(id);
    }
}
