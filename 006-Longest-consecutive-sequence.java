// 128. Longest Consecutive Sequence
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        int ans = 1,c = 1;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
            if(nums[i]-nums[i-1] == 1){
                c++;
            }
            else{
                ans = Math.max(ans,c);
                c = 1;
            }
            }
        }
        return Math.max(ans,c);
    }
}
