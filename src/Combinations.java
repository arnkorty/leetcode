import java.util.*;
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i = 1; i <= n; i++) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for(List<Integer> r : res) {
                List<Integer> a = new ArrayList<Integer>(r);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        //从所有集合中拿到个数是k的子集合加到结果集中
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(List<Integer> r : res) {
            if(r.size() == k) {
                list.add(r);
            }
        }
        return list;
    }
    public static void main(String[] args) {

    }
}
