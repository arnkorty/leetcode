public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");
        int len1 = parts1.length;
        int len2 = parts2.length;
        int i = 0;
        for(; i < len1 && i < len2; i ++){
            if(Integer.valueOf(parts1[i]) > Integer.valueOf(parts2[i])) return 1;
            if(Integer.valueOf(parts2[i]) > Integer.valueOf(parts1[i])) return -1;
        }
        if(len1 > len2){
            while(i < len1){
                if(Integer.valueOf(parts1[i++]) != 0) return 1;
            }
        }else if(len1 < len2){
            while(i < len2){
                if(Integer.valueOf(parts2[i++]) != 0) return -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
