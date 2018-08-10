public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int idxs = 0, idxp = 0, idxstar = -1, idxmatch = 0;
        while(idxs < s.length()){
            if(idxp < p.length() && (s.charAt(idxs) == p.charAt(idxp) || p.charAt(idxp) == '?')){
                idxp++;
                idxs++;
            } else if(idxp < p.length() && p.charAt(idxp)=='*'){
                idxstar = idxp;
                idxp++;
                idxmatch = idxs;
            } else if(idxstar != -1){
                idxp = idxstar + 1;
                idxmatch++;
                idxs = idxmatch;
            } else {
                return false;
            }
        }
        while(idxp < p.length() && p.charAt(idxp) == '*'){
            idxp++;
        }
        return idxp == p.length();
    }
    public static void main(String[] args) {

    }
}
