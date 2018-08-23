import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        if(num == null||num.length == 0)
            return 0;

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0 ;i<num.length; i++)
            hs.add(num[i]);

        int max = 0;
        for(int i=0; i<num.length; i++){
            if(hs.contains(num[i])){
                int count = 1;
                hs.remove(num[i]);

                int low = num[i] - 1;
                while(hs.contains(low)){
                    hs.remove(low);
                    low--;
                    count++;
                }

                int high = num[i] + 1;
                while(hs.contains(high)){
                    hs.remove(high);
                    high++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
