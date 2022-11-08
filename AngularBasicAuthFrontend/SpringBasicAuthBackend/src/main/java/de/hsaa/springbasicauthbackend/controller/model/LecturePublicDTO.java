package de.hsaa.springbasicauthbackend.controller.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LecturePublicDTO {

    private String id;
    private String name;
}
