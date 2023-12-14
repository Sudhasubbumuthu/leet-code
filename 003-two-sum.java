/*1. Two Sum */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t;
        for(int i=0; i<nums.length; i++){
            t = target-nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(t == nums[j]){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }
}
/* method 2 using hashmap */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int t = target - nums[i];
            if(mp.containsKey(t)){
                return new int[]{mp.get(t),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
