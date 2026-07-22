import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        
        currentPath.add(0);
        dfs(graph, 0, currentPath, result);
        
        return result;
    }
    
    private void dfs(int[][] graph, int currentNode, List<Integer> currentPath, List<List<Integer>> result) {
        if (currentNode == graph.length - 1) {
            result.add(new ArrayList<>(currentPath));
            return;
        }
        
        for (int neighbor : graph[currentNode]) {
            currentPath.add(neighbor);
            dfs(graph, neighbor, currentPath, result);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}
