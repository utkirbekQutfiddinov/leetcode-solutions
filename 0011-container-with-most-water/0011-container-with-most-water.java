class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxArea=0, currArea=0, lastArea=0;
        while(l<r){
            currArea=Math.min(height[l],height[r])*(r-l);
            if(currArea>maxArea){
                maxArea=currArea;
            }
            
            if(height[l]>height[r]){
                r--;
            }else {
                l++;
            }
        }

    return maxArea;

    }
}