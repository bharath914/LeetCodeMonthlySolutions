package graph;

import java.util.*;

class Graph {
    private Map<Character, List<Character>> adjList = new HashMap<>();

    // Add edges between nodes
    public void addEdge(char node, char neighbor) {
        adjList.computeIfAbsent(node, k -> new ArrayList<>()).add(neighbor);
    }

    // DFS implementation
    public void dfs(char start) {
        Set<Character> visited = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        
        // Start from the given node
        stack.push(start);
        
        while (!stack.isEmpty()) {
            char current = stack.pop();
            
            // If not visited, print and mark as visited
            if (!visited.contains(current)) {
                System.out.print(current + " ");
                visited.add(current);
            }
            
            // Add all unvisited neighbors to the stack
            for (char neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }
}

public class DFSExample {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('B', 'E');
        graph.addEdge('C', 'F');
        
        System.out.print("DFS Traversal starting from A: ");
        graph.dfs('A'); // Output should be A B D E C F
    }
}
