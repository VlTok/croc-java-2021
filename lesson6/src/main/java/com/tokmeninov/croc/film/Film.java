package com.tokmeninov.croc.film;

import com.tokmeninov.croc.models.Person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Film {
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    @XmlElementWrapper(name = "screenwriters")
    @XmlElement(name = "screenwriter")
    private final List<Person> screenwriters = new ArrayList<>();
    @XmlElementWrapper(name = "directors")
    @XmlElement(name = "director")
    private final List<Person> directors = new ArrayList<>();

    public Film(String title,String description){
        this.title = title;
        this.description = description;
    }

    public Film(){
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Person> getScreenwriters() {
        return screenwriters;
    }

    public List<Person> getDirectors() {
        return directors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title) && Objects.equals(description, film.description) && Objects.equals(screenwriters, film.screenwriters) && Objects.equals(directors, film.directors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, screenwriters, directors);
    }
}
