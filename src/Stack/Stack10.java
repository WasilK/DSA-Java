package Stack;

import java.util.Stack;

public class Stack10 {
    public static int maxAreaHistogram(int heights[]){
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];
        //next smaller right
        for(int i = heights.length - 1; i >= 0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();
        //next smaller left
        for(int i = 0; i < heights.length; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //area
        for(int i = 0; i < heights.length; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(maxAreaHistogram(heights));
    }
}
