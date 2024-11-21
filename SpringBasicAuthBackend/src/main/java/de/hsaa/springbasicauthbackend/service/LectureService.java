package de.hsaa.springbasicauthbackend.service;

import de.hsaa.springbasicauthbackend.model.Lecture;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class LectureService {
    Map<String, Lecture> lectureMap = new HashMap<>();

    {
        Lecture lecture1 = Lecture
                .builder()
                .id("1234")
                .lectureName("Projektseminar Programmierung")
                .students(List.of(
                        "Student 1",
                        "Student 2",
                        "Student 3",
                        "Student 4",
                        "Student 5"
                ))
                .build();
        Lecture lecture2 = Lecture
                .builder()
                .id("2345")
                .lectureName("Datenstruktur")
                .students(List.of(
                        "Student 1",
                        "Student 2",
                        "Student 3"
                ))
                .build();
        Lecture lecture3 = Lecture
                .builder()
                .id("345")
                .lectureName("Java 4 Beginners")
                .students(List.of(
                        "Student 1",
                        "Student 2"
                ))
                .build();
        lectureMap.put(lecture1.getId(), lecture1);
        lectureMap.put(lecture2.getId(), lecture2);
        lectureMap.put(lecture3.getId(), lecture3);

    }

    public Collection<Lecture> getAllLectures() {
        return lectureMap.values();
    }

    public Optional<Lecture> getLectureById(String id) {
        if (lectureMap.containsKey(id))
            return Optional.of(lectureMap.get(id));
        else
            return Optional.empty();
    }
}
