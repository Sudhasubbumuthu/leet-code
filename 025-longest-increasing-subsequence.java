// 300. Longest Increasing Subsequence
class Solution {
    public int lengthOfLIS(int[] nums) {
        //dynamic programming, creating an array to update the next values or greater then add
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);
        for(int i = nums.length-1; i >= 0; i--){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    LIS[i] = Math.max(LIS[i], 1+LIS[j]);
                }
            }
        }
        Arrays.sort(LIS);
        return LIS[nums.length-1];
    }
}
