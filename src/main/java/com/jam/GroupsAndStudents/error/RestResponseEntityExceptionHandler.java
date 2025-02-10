package com.jam.GroupsAndStudents.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler {


    protected ResponseEntity<ErrorDTO> handleBadException() {
        return ResponseEntity
                .status(400)
                .header("smth")
                .body(new ErrorDTO(400, "Error when we trying to add entity into DB with empty fields"));
    }
}
