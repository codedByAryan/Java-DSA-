// trapping rainwater Revise

public class trappedWater {
    public static int Trapped_Water(int height[]){
        int n=height.length;
        // left_Max boundary --> array [Auxillary Array]
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // right_Max boundary --> array [Auxillary Array]
        int rightMax[] = new int[height.length];
        rightMax[n-1]=height[n];
        for(int j=n-2; j>=0; j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }

        // loop for trapped water
        int trapped_water = 0;
        for(int k=0; k<n; k++){
            int water_level = Math.min(leftMax[k], rightMax[k]);
            trapped_water += water_level-height[k];
        }
        return trapped_water;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water is: " + Trapped_Water(height));
    }
}
