import java.util.*;
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) return 0;

        Stack<Integer> stHeight = new Stack<Integer>();
        Stack<Integer> stIndex = new Stack<Integer>();
        int max = 0;

        for(int i = 0; i < height.length; i++){
            if(stHeight.isEmpty() || height[i] > stHeight.peek()){
                stHeight.push(height[i]);
                stIndex.push(i);
            }else if(height[i] < stHeight.peek()){
                int lastIndex = 0;
                while(!stHeight.isEmpty() && height[i] < stHeight.peek()){
                    lastIndex = stIndex.pop();
                    int area = stHeight.pop()*(i - lastIndex);
                    if(max < area){
                        max = area;
                    }
                }
                stHeight.push(height[i]);
                stIndex.push(lastIndex);
            }
        }
        while(!stHeight.isEmpty()){
            int area = stHeight.pop()*(height.length - stIndex.pop());
            max = max < area ? area:max;
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
