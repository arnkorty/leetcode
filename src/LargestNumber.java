import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<length;i++)
            list.add(nums[i]);
        StringBuilder builder = new StringBuilder();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                int tmpVal1 = val1,tmpVal2 = val2;
                int tmp1 = val1,tmp2 = val2;

                while(true)
                {
                    tmp2/=10;
                    tmpVal1=tmpVal1*10;
                    if(tmp2==0)
                        break;
                }
                tmpVal1+=val2;

                while(true){
                    tmpVal2 = tmpVal2*10;
                    tmp1/=10;
                    if(tmp1==0)
                        break;
                }
                tmpVal2+=val1;

                return tmpVal1-tmpVal2;
            }
        });
        if((int)list.get(length-1)==0)
            return "0";
        for(int i = length-1;i>=0;i--){
            builder.append(list.get(i));
        }
        return builder.toString();
    }
    public static void main(String[] args) {

    }
}
