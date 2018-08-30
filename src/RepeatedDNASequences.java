import java.util.ArrayList;
import java.util.List;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s){
        List<String> res = new ArrayList<>();
        if (s == null || s.length() < 10) {
            return res;
        }
        char[] map = new char[256];
        map['A'] = 0;
        map['C'] = 1;
        map['G'] = 2;
        map['T'] = 3;
        int mask = 0xfffff;
        int val = 0;
        char[] schar = s.toCharArray();
        for (int i = 0;i < 9 ;i ++ ) {
            val = (val << 2) | (map[schar[i]] & 3);
        }
        byte[] bytes = new byte[1 << 20];
        for (int i = 9;i < schar.length ;i ++ ) {
            val = ((val << 2) & mask) | ((map[schar[i]]) & 3);
            if (bytes[val] == 1) {
                res.add(String.valueOf(schar,i - 9,10));
            }
            if (bytes[val] < 2)   bytes[val]++;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
