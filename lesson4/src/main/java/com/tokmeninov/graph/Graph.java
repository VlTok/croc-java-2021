package com.tokmeninov.graph;


import com.tokmeninov.vertex.Vertex;

import java.util.*;

/**
 * Класс графа
 */
public class Graph<T> {

    /**
     *  Вершина к его индексу
     */
    private final Map<Integer,Integer> showVertex;
    /**
     * Список вершин
     */
    private final List<Vertex<T>> vertexList;
    /**
     * Текущее количество вершин
     */
    private Integer count;


    private final Comparator<List<Vertex<T>>> comparer = Comparator.comparing(o -> o.get(0).getIndex());

    public Graph() {
        this.showVertex = new HashMap<>();
        this.vertexList = new ArrayList<>();
        this.count = 0;
    }

    /**
     * Добавление вершины
     * @param label данные вершины
     * @param index индекс вершины
     */
    public void insertVertex(T label, Integer index) {
        Vertex<T> myVertex = new Vertex<>(index,label);
        vertexList.add(myVertex);
        showVertex.put(index, vertexList.size() - 1);
        count++;
    }

    /**
     * Удаление вершины
     * @param index индекс вершины, оторую удаляем
     */
    public void removeVertex(Integer index) {
        Vertex<T> rVertex = vertexList.get(showVertex.get(index));

        /**
         * Удаление младщих элементов
         */
        for (Vertex<T> v : vertexList) {
            if (v.getChildVertex().contains(rVertex)) {
                v.deleteChildVertex(rVertex);
            }
        }
        /**
         * Изоляция узла
         */
        for (Vertex<T> v : vertexList) {
            boolean removeFlag = true;
            if (rVertex.getChildVertex().contains(v)) {
                for (Vertex<T> fatherVertex : vertexList) {
                    if (rVertex == fatherVertex) {
                        continue;
                    }
                    if (fatherVertex.getChildVertex().contains(v)) {
                        removeFlag = false;
                        break;
                    }
                }
            }
            if (removeFlag) v.setHasFather(false);
        }
        vertexList.remove(showVertex.get(index));
        showVertex.remove(index);
        count--;
    }

    /**
     * Имеет ся ли вершина по такому индексу
     * @param index индекс поиска вершины
     * @return boolean (есть или нет)
     */
    public boolean haveVertex(Integer index) {
        return showVertex.get(index) != null;
    }

    /**
     * Добавить ребро
     * @param oneIndex индекс первой вершины
     * @param twoIndex индекс второй вершины
     * @return добавилось или нет
     */
    public Boolean insertEdge(Integer oneIndex, Integer twoIndex) {
        Integer vertexIndexOne;
        Integer vertexIndexTwo;
        Vertex<T> vertexOne;
        Vertex<T> vertexTwo;
        if (showVertex.get(oneIndex) == null || showVertex.get(twoIndex) == null) {
            return false;
        } else {
            vertexIndexOne = showVertex.get(oneIndex);
            vertexIndexTwo = showVertex.get(twoIndex);
            vertexOne = vertexList.get(vertexIndexOne);
            vertexTwo = vertexList.get(vertexIndexTwo);
            vertexOne.addChildVertex(vertexTwo);
            vertexTwo.addChildVertex(vertexTwo);
        }
        return true;
    }

    /**
     * Удаление ребра
     * @param indexVertexOne индекс первой вершины
     * @param indexVertexTwo индекс второй вершины
     */
    public void removeEdge(Integer indexVertexOne, Integer indexVertexTwo) {
        if(showVertex.get(indexVertexOne) == null || showVertex.get(indexVertexTwo) == null) {
            return;
        }
        Vertex<T> vertexOne = vertexList.get(showVertex.get(indexVertexOne));
        Vertex<T> vertexTwo = vertexList.get(showVertex.get(indexVertexTwo));

        vertexOne.deleteChildVertex(vertexTwo);
        vertexTwo.deleteChildVertex(vertexOne);

        if (hasIsolation(vertexOne)) vertexOne.setHasFather(false);
        if (hasIsolation(vertexTwo)) vertexTwo.setHasFather(false);
    }

    /**
     * Является ли озолированным
     * @param vertex вершина
     * @return true false
     */
    private boolean hasIsolation(Vertex<T> vertex) {
        boolean isolateFlag = true;

        for (Vertex<T> vertexFather : vertexList) {
            if (vertexFather.getChildVertex().contains(vertex)) {
                isolateFlag = false;
                break;
            }
        }
        return isolateFlag;
    }

    /**
     * Есть ли такое ребро?
     * @param indexBegin начало ребра
     * @param indexEnd конец ребра
     * @return true false
     */
    public boolean haveEdge(Integer indexBegin, Integer indexEnd) {
        if (showVertex.get(indexBegin) == null || showVertex.get(indexEnd) == null) {
            return false;
        }

        Vertex<T> vertexBegin = vertexList.get(showVertex.get(indexBegin));
        Vertex<T> vertexEnd = vertexList.get(showVertex.get(indexEnd));

        return vertexBegin.haveEdge(vertexEnd) && vertexEnd.haveEdge(vertexBegin);
    }

    public Map<Integer, Integer> getShowVertex() {
        return showVertex;
    }

    public List<Vertex<T>> getVertexList() {
        return vertexList;
    }

    public Comparator<List<Vertex<T>>> getComparer() {
        return comparer;
    }

    public Integer getCount() {
        return count;
    }
}
