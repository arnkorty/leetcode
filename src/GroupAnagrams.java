import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char [] str2char = s.toCharArray();
            Arrays.sort(str2char);
            String sortedStr = String.valueOf(str2char);
            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(s);
            }else{
                ArrayList<String> tmp = new ArrayList<String>();
                tmp.add(s);
                map.put(sortedStr, tmp);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for (List<String> list : map.values()) {
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
