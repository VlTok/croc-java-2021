package com.tokmeninov;

import com.tokmeninov.graph.CommandGraph;
import com.tokmeninov.graph.Graph;
import com.tokmeninov.vertex.Vertex;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        CommandGraph<String> commandGraph = new CommandGraph<>();
        commandGraph.getGraph().insertVertex("A",1);
        commandGraph.getGraph().insertVertex("B",2);
        commandGraph.getGraph().insertVertex("C",3);
        commandGraph.getGraph().insertVertex("D",4);
        commandGraph.getGraph().insertVertex("E",5);

        commandGraph.getGraph().insertEdge(1,2);
        commandGraph.getGraph().insertEdge(1,3);
        commandGraph.getGraph().insertEdge(2,4);

        List<List<Vertex<String>>> comparer;
        comparer = commandGraph.sortSubGraphs();
        for (List<Vertex<String>> vertices : comparer) {
            System.out.println("Компоненты связанности:");
            for (Vertex<String> vertex : vertices) {
                System.out.println(vertex.toString());
            }
        }
        System.out.println(commandGraph.sizeConnectivityComponents(comparer));
    }
}
