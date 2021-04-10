package com.tokmeninov.croc;

import com.tokmeninov.croc.film.Film;
import com.tokmeninov.croc.jaxb.JaxbConverter;
import com.tokmeninov.croc.models.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JaxbTest {

    @Test
    public void correctWorkProgramInput() throws IOException {
        JaxbConverter converter = new JaxbConverter();
        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");
        Person person3 = new Person("Person 3");
        Person person4 = new Person("Person 4");
        Film film1 = new Film("Властелин колец", "Фантастика");
        film1.getScreenwriters().add(person1);
        film1.getDirectors().add(person1);
        film1.getDirectors().add(person2);
        Film film2 = new Film("Ирония судьбы", "Комедия");
        film2.getScreenwriters().add(person3);
        film2.getDirectors().add(person3);
        film2.getDirectors().add(person2);
        Film film3 = new Film("Назад в будущее", "Фантастика");
        film3.getScreenwriters().add(person1);
        film3.getDirectors().add(person3);
        film3.getDirectors().add(person4);
        Films films = new Films();
        films.getFilmList().add(film1);
        films.getFilmList().add(film2);
        films.getFilmList().add(film3);
        String xml = converter.toXml(films);
        System.out.println(xml);
        Assertions.assertEquals(films, converter.fromXml(xml, Films.class));
    }
}
