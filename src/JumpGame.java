public class JumpGame {
    public boolean canJump(int[] nums) {
        //判断是不是能走到这里
        if (nums.length == 1)
            return true;
        int loc;
        int glo = 0;
        boolean res = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (glo < i)
                break;
            //局部解和全局解
            loc = i+nums[i];
            glo = Math.max(glo,loc);
        }
        if (glo >= nums.length-1)
            res = true;
        return res;
    }
    public static void main(String[] args) {

    }
}
