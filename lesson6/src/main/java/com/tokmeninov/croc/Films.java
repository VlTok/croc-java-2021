package com.tokmeninov.croc;

import com.tokmeninov.croc.film.Film;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XmlRootElement(name = "films")
public class Films {
    @XmlElement(name = "film")
    private final List<Film> filmList = new ArrayList<>();

    public Films(){
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Films movies = (Films) o;
        return Objects.equals(filmList, movies.filmList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmList);
    }
}
