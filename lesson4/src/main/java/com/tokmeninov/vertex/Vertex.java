package com.tokmeninov.vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Класс содержищий вершину
 */
public class Vertex<T>{

    /**
     * Индекс вершины
     */
    private Integer index;

    /**
     * Данные вершины
     */
    private T label;

    /**
     * Список младших вершин, которые принадлежат данной вершине
     */
    List<Vertex<T>> childVertex;

    /**
     * Имеет ли вершина родителя
     */
    private boolean hasFather;

    public Vertex(Integer index,T label) {
        this.index = index;
        this.label = label;
        this.childVertex = new ArrayList<>();
        this.hasFather = false;
    }

    /**
     * Добавление новой младшей вершины
     * @param vertex младшая вершина
     */
    public void addChildVertex(Vertex<T> vertex){
        childVertex.add(vertex);
    }

    /**
     * Добавление младшей вершины по данным
     * @param label данные поступающие новой вершине
     */
    public void addChildVertexByLabel(Integer index,T label){
        Vertex<T> vertex = new Vertex<>(index,label);
        addChildVertex(vertex);
    }
    /**
     * Есть ли ребро у нашей вершины
     * @param endVertex конец ребра
     * @return список дочерних рёбер
     */
    public boolean haveEdge(Vertex<T> endVertex){
        return childVertex.contains(endVertex);
    }

    /**
     * Удаление какой-то младшей вершины
     * @param childVertex младшая вершина
     */
    public void deleteChildVertex(Vertex<T> childVertex){
        this.childVertex.remove(childVertex);
    }

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public List<Vertex<T>> getChildVertex() {
        return childVertex;
    }

    public boolean isHasFather() {
        return hasFather;
    }

    public void setHasFather(boolean hasFather) {
        this.hasFather = hasFather;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return hasFather == vertex.hasFather && Objects.equals(index, vertex.index) && Objects.equals(label, vertex.label) && Objects.equals(childVertex, vertex.childVertex);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "index=" + index +
                ", label=" + label +
                '}';
    }
}
