public class Solution {
    public int FindGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        foreach(int num in nums){
            min=Math.Min(min, num);
            max=Math.Max(max, num);
        }
        while(max%min!=0){
            int temp=max%min;
            max=min;
            min=temp;
        }
        return min;
    }
}