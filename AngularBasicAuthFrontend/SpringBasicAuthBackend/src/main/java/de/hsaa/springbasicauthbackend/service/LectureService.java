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
                        "Nico Bay",
                        "Philipp Beisswanger",
                        "Mahir Berkcan",
                        "Marcus Bilo",
                        "Tim Dauser",
                        "Niklas Dimoski",
                        "Tobias Gentner",
                        "Alexander Ginkel",
                        "Tim Grunwald",
                        "Sara Haileselassie",
                        "Jannic Hofmann",
                        "Hendrik Illenberger",
                        "Robin Kirrmann",
                        "Fabian Klaerer",
                        "Moritz Knoellv",
                        "Ferhat Nazlioglu",
                        "Timon Neitzel",
                        "Kim Neuhaeusler",
                        "Sinem Oezkan",
                        "Muhammed Oeztuerk",
                        "Isabel Ostermann",
                        "Rene Priel",
                        "Jonas Roessel",
                        "Christoph Schuerger",
                        "Jacob Schulze",
                        "Marius Traub",
                        "Furkan Vural",
                        "Kai Wannenwetsch",
                        "Jonas Werner",
                        "Robin Wiedemann",
                        "Nico Wittek",
                        "Selim Yilmaz",
                        "Toni Zubac"
                ))
                .build();
        Lecture lecture2 = Lecture
                .builder()
                .id("2345")
                .lectureName("Datenstruktur")
                .students(List.of(
                        "Nico Bay",
                        "Philipp Beisswanger",
                        "Mahir Berkcan",
                        "Marcus Bilo"
                ))
                .build();
        Lecture lecture3 = Lecture
                .builder()
                .id("345")
                .lectureName("Java 4 Beginners")
                .students(List.of(
                        "Robin Wiedemann",
                        "Nico Wittek",
                        "Selim Yilmaz",
                        "Toni Zubac"
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
