package org.example.database;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDetail {
    private int studentId;
    private String studentName;
    private String lastName;
    private String address;
    private String city;

}
