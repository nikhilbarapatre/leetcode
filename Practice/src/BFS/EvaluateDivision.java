package BFS;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries){
        Map<String, Map<String, Double>> graph = createGraph(equations, values);
        double[] result = new double[queries.length];
        for(int i = 0; i < queries.length; i++){
            result[i] = getPathVal(queries[i][0], queries[i][1], new HashSet<String>(), graph);
        }
        return result;
    }

    private double getPathVal(String numerator, String denominator, Set<String> visited, Map<String, Map<String, Double>> graph){
        if(!graph.keySet().contains(numerator))
            return -1;
        if(graph.keySet().contains(numerator) && graph.get(numerator).keySet().contains(denominator))
            return graph.get(numerator).get(denominator);
        if(numerator.equals(denominator))
            return 1;
        visited.add(numerator);
        double path = 1;
        for(String neighbor : graph.get(numerator).keySet()){
            if(!visited.contains(neighbor)){
                path = getPathVal(neighbor, denominator, visited, graph);
                if(path > 0)
                    return path * graph.get(numerator).get(neighbor);
            }
        }
        return -1;
    }

    private Map<String, Map<String, Double>> createGraph(String[][] equations, double[] values){
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for(int i = 0; i < equations.length; i++){
            String numerator = equations[i][0];
            String denominator = equations[i][1];
            if(graph.get(numerator) == null)
                graph.put(numerator, new HashMap<String, Double>());
            graph.get(numerator).put(denominator, values[i]);
            if(graph.get(denominator) == null)
                graph.put(denominator, new HashMap<String, Double>());
            graph.get(denominator).put(numerator, 1 / values[i]);
        }
        return graph;
    }

    public static void main(String[] args) {
        EvaluateDivision eval = new EvaluateDivision();
        String[][] equations = {{"a", "b"}, {"b", "c"}};
        double[] values = {2.0, 3.0};
        String[][] queries = {{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
        double[] result = eval.calcEquation(equations, values, queries);
        for(double r : result)
            System.out.println(r);
    }
}
