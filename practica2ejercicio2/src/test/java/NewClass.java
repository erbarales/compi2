/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jgrapht.*;
import org.jgrapht.alg.connectivity.*;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm.*;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.alg.shortestpath.*;
import org.jgrapht.graph.*;

import java.util.*;
import org.junit.Test;

/**
 *
 * @author eddyb
 */
public class NewClass {
    
    @Test
    public void main() {
        //@example:main:begin
        // constructs a directed graph with the specified vertices and edges
        Graph<String, DefaultEdge> directedGraph =
            new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
        directedGraph.addVertex("a");
        directedGraph.addVertex("b");
        directedGraph.addVertex("c");
        directedGraph.addVertex("d");
        directedGraph.addVertex("e");
        directedGraph.addVertex("f");
        directedGraph.addVertex("g");
        directedGraph.addVertex("h");
        directedGraph.addVertex("i");
        directedGraph.addEdge("a", "b");
        directedGraph.addEdge("b", "d");
        directedGraph.addEdge("d", "c");
        directedGraph.addEdge("c", "a");
        directedGraph.addEdge("e", "d");
        directedGraph.addEdge("e", "f");
        directedGraph.addEdge("f", "g");
        directedGraph.addEdge("g", "e");
        directedGraph.addEdge("h", "e");
        directedGraph.addEdge("i", "h");

        // computes all the strongly connected components of the directed graph
        StrongConnectivityAlgorithm<String, DefaultEdge> scAlg =
            new KosarajuStrongConnectivityInspector<>(directedGraph);
        List<Graph<String, DefaultEdge>> stronglyConnectedSubgraphs =
            scAlg.getStronglyConnectedComponents();

        // prints the strongly connected components
        System.out.println("Strongly connected components:");
        for (int i = 0; i < stronglyConnectedSubgraphs.size(); i++) {
            System.out.println(stronglyConnectedSubgraphs.get(i));
        }
        System.out.println();

        // Prints the shortest path from vertex i to vertex c. This certainly
        // exists for our particular directed graph.
        System.out.println("Shortest path from i to c:");
        DijkstraShortestPath<String, DefaultEdge> dijkstraAlg =
            new DijkstraShortestPath<>(directedGraph);
        SingleSourcePaths<String, DefaultEdge> iPaths = dijkstraAlg.getPaths("i");
        System.out.println(iPaths.getPath("c") + "\n");

        // Prints the shortest path from vertex c to vertex i. This path does
        // NOT exist for our particular directed graph. Hence the path is
        // empty and the result must be null.
        System.out.println("Shortest path from c to i:");
        SingleSourcePaths<String, DefaultEdge> cPaths = dijkstraAlg.getPaths("c");
        System.out.println(cPaths.getPath("i"));
        //@example:main:end
    }
    
}
