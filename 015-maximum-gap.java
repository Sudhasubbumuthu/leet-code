//164. Maximum gap
class Solution {
    public int maximumGap(int[] nums) {
       if(nums.length < 2)
            return 0;
       int s = 0;
       Arrays.sort(nums);
       for(int i=0; i<nums.length-1; i++){
           int t = nums[i+1]-nums[i];
           if(s < t)
                s = t;
       } 
       return s;
    }
}
