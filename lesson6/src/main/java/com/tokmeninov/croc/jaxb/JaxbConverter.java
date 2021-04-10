package com.tokmeninov.croc.jaxb;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JaxbConverter {

    public JaxbConverter(){
    }

    /**
     * Сериализует объект в xml.
     *
     * @param data объект
     * @return xml
     */
    public String toXml(Object data) throws JsonProcessingException {
        return createXmlMapper().writeValueAsString(data);
    }

    /**
     * Десериализация из xml.
     *
     * @param xml xml
     * @param type тип объекта
     * @param <T> тип
     * @return объект
     */
    public <T> T fromXml(String xml, Class<T> type) throws IOException {
        return createXmlMapper().readValue(xml, type);
    }

    /**
     * Создаём настроенный mapper JAXB.
     * @return mapper
     */
    private XmlMapper createXmlMapper() {
        final XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new JaxbAnnotationModule()); // модуль jaxb
        mapper.enable(SerializationFeature.INDENT_OUTPUT); // форматирование вывода
        return mapper;
    }

    /**
     * Вытаскиваем объект из файла xml
     * @param filePath путь к файлу
     * @param type тип класса
     * @param <T> сам класс который поступает
     * @return <T> сам класс который мы передаём
     * @throws IOException
     */
    public <T> T fromFileToObject(String filePath, Class<T> type) throws IOException{
        String xml = Files.lines(Paths.get(filePath)).reduce("", String::concat);
        return fromXml(xml,
                type);
    }
}