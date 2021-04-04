package com.tokmeninov;

import com.tokmeninov.graph.CommandGraph;
import com.tokmeninov.graph.Graph;
import com.tokmeninov.vertex.Vertex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Тесты класса с логикой графа
 */
public class CommandGraphTest {

    /**
     * Тест компоненты связанности
     */
    @Test
    public void testConnectivityComponents(){
        CommandGraph<String> nullGraph = new CommandGraph<>();
        nullGraph.getGraph().insertVertex("A",1);
        nullGraph.getGraph().insertVertex("B",2);
        nullGraph.getGraph().insertVertex("C",3);
        List<List<Vertex<String>>> comparer = nullGraph.sortSubGraphs();

        Assertions.assertEquals(3,nullGraph.sizeConnectivityComponents(comparer));
    }
}
