package de.hsaa.springbasicauthbackend.controller;

import de.hsaa.springbasicauthbackend.model.Lecture;
import de.hsaa.springbasicauthbackend.service.LectureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/private/v1/lecture")
public class LectureController {
    final private LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping()
    public ResponseEntity<Collection<Lecture>> getAllLecture() {
        return new ResponseEntity<>(lectureService.getAllLectures(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Lecture> getLectureByID(@PathVariable String id) {
        Optional<Lecture> lecture = this.lectureService.getLectureById(id);
        return lecture.map(
                value -> new ResponseEntity<>(value, HttpStatus.OK)
        ).orElseGet(
                () -> new ResponseEntity<>(HttpStatus.NOT_FOUND)
        );
    }
}
