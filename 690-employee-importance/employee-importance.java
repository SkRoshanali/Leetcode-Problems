/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        
        for (Employee emp : employees) {
            employeeMap.put(emp.id, emp);
        }
        
        return dfs(id, employeeMap);
    }
    
    private int dfs(int currentId, Map<Integer, Employee> employeeMap) {
        Employee emp = employeeMap.get(currentId);
        int totalImportance = emp.importance;
        
        for (int subId : emp.subordinates) {
            totalImportance += dfs(subId, employeeMap);
        }
        
        return totalImportance;
    }
}
