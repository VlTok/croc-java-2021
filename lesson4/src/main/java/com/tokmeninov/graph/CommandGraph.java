package com.tokmeninov.graph;

import com.tokmeninov.vertex.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс с логикой графа
 * @param <T> тип данных которые будут у вершин
 */
public class CommandGraph<T>{

    /**
     * Наш граф
     */
    private final Graph<T> graph;

    public CommandGraph() {
        graph = new Graph<>();
    }

    /**
     * Поиск с помощью алгоритма search in depth
     * @param index индекс вершины
     * @param using использование
     * @param comp компонент связанности
     */
    private void searchInDepth(Integer index, Map<Integer, Boolean> using, List<List<Vertex<T>>> comp) {
        Integer vertexIndex = graph.getShowVertex().get(index);
        Vertex<T> vertex = graph.getVertexList().get(vertexIndex);
        comp.get(comp.size() - 1).add(vertex);
        using.put(index, true);
        for (Vertex<T> v : vertex.getChildVertex()) {
            if(using.get(v.getIndex()) == null) {
                searchInDepth(v.getIndex(),using,comp);
            }
        }
    }

    /**
     * Сортирует подграф
     * @return отсортированный компоратор
     */
    public List<List<Vertex<T>>> sortSubGraphs() {
        List<List<Vertex<T>>> comparer = new ArrayList<>();
        Map<Integer, Boolean> using= new HashMap<>();
        for (Vertex<T> vertex : graph.getVertexList()) {
            if (using.get(vertex.getIndex()) == null) {
                comparer.add(new ArrayList<Vertex<T>>());
                searchInDepth(vertex.getIndex(), using, comparer);
            }
        }

        comparer.sort(graph.getComparer());
        return comparer;
    }

    /**
     * Размер компонента связанности
     * @param comparer компоненты связанности
     * @return размер компонента связанности
     */
    public Integer sizeConnectivityComponents(List<List<Vertex<T>>> comparer) {
        return comparer.size();
    }

    public Graph<T> getGraph() {
        return graph;
    }
}
