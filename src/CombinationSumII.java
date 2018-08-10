import java.util.*;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();

        getResults(candidates, 0, new ArrayList<>(), result, target);
        return result;
    }

    public void getResults(int[] candidates, int start, List<Integer> cell, List<List<Integer>> result, int target) {
        if(target<0)return;
        if (target == 0) {
            result.add(new ArrayList<>(cell));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
             cell.add(candidates[i]);
            getResults(candidates, i+1, cell, result, target - candidates[i]);
            cell.remove(cell.size() - 1);
            while(i<candidates.length-1 && candidates[i] == candidates[i+1]){
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        System.out.println(new CombinationSumII().combinationSum2(nums, 8));
    }
}
