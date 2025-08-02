import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(List.of(1));
            for(int i = 1; i < numRows; i++){
                List<Integer> currRow = new ArrayList<>();
                currRow.add(1);
                List<Integer> prevRow = result.get(i - 1);
                for(int j = 1; j < i; j++){
                    currRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                currRow.add(1);
                result.add(currRow);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(6));
    }
}
