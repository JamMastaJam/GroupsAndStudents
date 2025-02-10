package com.jam.GroupsAndStudents.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupDTO {

    private int id;
    private String groupNumber;
    private int quantityOfStudent;

}
