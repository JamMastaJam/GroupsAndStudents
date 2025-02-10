package com.jam.GroupsAndStudents.mapper;

import com.jam.GroupsAndStudents.dto.GroupDTO;
import com.jam.GroupsAndStudents.entity.Group;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface GroupMapper {

    GroupDTO toDTO(Group group);

    List<GroupDTO> toDTOList(List<Group> groups);

    Group toEntity(GroupDTO groupDTO);

    List<Group> toEntitYList(List<GroupDTO> groupDTOS);
}
