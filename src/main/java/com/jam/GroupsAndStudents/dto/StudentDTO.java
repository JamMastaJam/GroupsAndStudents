package com.jam.GroupsAndStudents.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

    private int id;
    private String acceptDate;
    private String fullName;
}
