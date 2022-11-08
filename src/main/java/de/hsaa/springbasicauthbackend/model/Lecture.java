package de.hsaa.springbasicauthbackend.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Lecture {

    private String id;
    private String lectureName;
    private List<String> students;

}
