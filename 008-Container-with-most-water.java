// 11.Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int totalarea = 0;
        while(l < r){
            int cur = Math.min(height[l],height[r]) * (r-l);
            totalarea = Math.max(totalarea,cur);
            if(height[l] < height[r])
                l++;
            else
                r--;
        }    
        return totalarea;
    }
}
