package de.hsaa.springbasicauthbackend.controller;

import de.hsaa.springbasicauthbackend.controller.model.LecturePublicDTO;
import de.hsaa.springbasicauthbackend.model.Lecture;
import de.hsaa.springbasicauthbackend.service.LectureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/public/v1/lecture")
public class PublicLectureController {

    final private LectureService lectureService;

    public PublicLectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping()
    public ResponseEntity<Collection<LecturePublicDTO>> getAllLecture() {

        Collection<Lecture> allLectures = lectureService.getAllLectures();
        Collection<LecturePublicDTO> returnList = allLectures
                .stream()
                .map(
                        l -> LecturePublicDTO
                                .builder()
                                .id(l.getId())
                                .name(l.getLectureName())
                                .build()
                ).toList();
        return new ResponseEntity(returnList, HttpStatus.OK);
    }
}
