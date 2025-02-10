package com.jam.GroupsAndStudents.service;

import com.jam.GroupsAndStudents.dto.GroupDTO;
import com.jam.GroupsAndStudents.entity.Group;
import com.jam.GroupsAndStudents.mapper.GroupMapper;
import com.jam.GroupsAndStudents.repository.GroupRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService{

    private final GroupRepository groupRepository;
    private final GroupMapper groupMapper;

    @Override
    public GroupDTO addGroup(GroupDTO groupDTO) {
        Group savedGroup = groupRepository.save(groupMapper.toEntity(groupDTO));
        return groupMapper.toDTO(savedGroup);
    }

    @Override
    public List<GroupDTO> getAllGroups() {
        return groupRepository.findAll()
                .stream()
                .map(group -> new GroupDTO(
                        group.getId(),
                        group.getGroupNumber(),
                        group.getStudents().size()
                        )).collect(Collectors.toList());

//        return groupMapper.toDTOList(groupRepository.findAll());
    }

    @Override
    public GroupDTO getGroup(int id) {


        return groupRepository.findById(id)
                .map(groupMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Group not found"));
    }

    @Override
    public void deleteGroup(int id) {
        groupRepository.deleteById(id);
    }

    public int getQuantityOfStudents(int id) {
        Group group = groupMapper.toEntity(getGroup(id));
        return group.getStudents().size();

    }

    private GroupDTO toDTO(int id) {
        return GroupDTO.builder()
                .id(getGroup(id).getId())
                .groupNumber(getGroup(id).getGroupNumber())
                .quantityOfStudent(getGroup(id).getQuantityOfStudent())
                .build();
    }
}
