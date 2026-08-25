import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}
        // int currentSum=nums[0];
        // int maxSum=nums[0];
        // for(int i=1; i<nums.length; i++){
        //     currentSum= Math.max(nums[i], nums[i]+currentSum);
        //     maxSum=Math.max(maxSum, currentSum);
        // }
        // return maxSum;


        // int []a={-2,1,-3,4,-1,2,1,-5,4};
        // int max=0;
        // for(int i=0; i<a.length; i++){
        //     int sum=0;
        //     for(int j=i; j<a.length;i++){
        //         sum+=a[i];
        //         System.out.println(sum);
        //         max=Math.max(max,sum);
        //     }
        // }
        // System.out.println(max);