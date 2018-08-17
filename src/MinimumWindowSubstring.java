public class MinimumWindowSubstring {
    public String minWindow(String S, String T) {
        int[] srcHash = new int[255];
        for(int i = 0; i < T.length(); i++){
            srcHash[T.charAt(i)]++;
        }
        int start = 0,i= 0;
        int[] destHash = new int[255];
        int found = 0;
        int begin = -1, end = S.length(), minLength = S.length();
        for(start = i = 0; i < S.length(); i++){
            destHash[S.charAt(i)]++;
            if(destHash[S.charAt(i)] <= srcHash[S.charAt(i)]) found++;
            if(found == T.length()){
                while(start < i && destHash[S.charAt(start)] > srcHash[S.charAt(start)]){
                    destHash[S.charAt(start)]--;
                    start++;
                }
                if(i - start < minLength){
                    minLength = i - start;
                    begin = start;
                    end = i;
                }
                destHash[S.charAt(start)]--;
                found--;
                start++;
            }
        }
        return begin == -1 ? "" : S.substring(begin,end + 1);
    }
    public static void main(String[] args) {

    }
}
