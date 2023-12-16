//167. two sum II : method 1:using the 2 pointer
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length-1;
        while(l < r){
            if(numbers[l] + numbers[r] == target){
                return new int[]{l+1,r+1};
            }
            else if(numbers[l] + numbers[r] > target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{};
    }
}
//method 2 using binary search
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int search,l,r,n = numbers.length-1,mid;
        for(int i=0; i<numbers.length-1; i++){
            search = target-numbers[i];
            l = i+1;
            r = numbers.length-1;
            while(l <= r){
                mid = l+(r-l)/2;
                if(numbers[mid] > search){
                    r = mid-1;
                }
                else if(numbers[mid] < search){
                    l = mid+1;
                }
                else{
                    return new int[]{i+1,mid+1};
                }
            }
        }
        return new int[]{};
    }
}
