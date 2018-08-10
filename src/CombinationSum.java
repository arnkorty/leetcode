import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        getResult(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private  void getResult(List<List<Integer>> result, ArrayList<Integer> current, int[] candidates, int target,
                                  int start) {
        if(target<0)    return;
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = start; i<candidates.length && target >= candidates[i]; i++){
            current.add(candidates[i]);
            getResult(result, current, candidates, target-candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        System.out.println(new CombinationSum().combinationSum(nums, 8));
    }
}