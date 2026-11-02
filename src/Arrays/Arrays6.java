package Arrays;

public class Arrays6 {
    public static int trapRainwater(int height[]){
        int n = height.length;
        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //loop for trapped water
        int width = 1; // given in question so that s why we are not multiplying it.
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapRainwater(arr));
    }
}
