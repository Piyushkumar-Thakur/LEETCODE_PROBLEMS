class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < nums.length){
            if(nums[j] == 0) count++;
            if(count > k){
                if(nums[i] == 0) count--;
                i++;
            }
            j++;
        }
        return j - i;
    }
}