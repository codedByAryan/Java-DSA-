
import java.lang.*;
public class TrappingRainwater {
    public static int trappedRainwater(int height[]){
       // int n=height.length;
        // Calculate Left Max Boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculate Right Max Boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);

        }

       int trappedWater = 0;
        // loop
       for (int j = 0; j<height.length; j++) {
       int  waterlevel = Math.min(leftMax[j], rightMax[j]);
       trappedWater += waterlevel-height[j];
           
       }
       return trappedWater;
        // trapped water = waterlevel - height[i]

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result = trappedRainwater(height);
        System.out.println(result);
    }
    
}
