class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int num : nums){
            max=Math.max(max, num);
            min=Math.min(min,num);
        }
        while(max%min!=0){
            int temp=max%min;
            max=min;
            min=temp;
        }
        return min;
    }
}


// class Solution {
//     public int findGCD(int[] nums) {
//         Arrays.sort(nums);
//         int min = nums[0];
//         int max = nums[nums.length - 1];
//         return gcd(min, max);
//     }
//     public int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }


        // Arrays.sort(nums);

        // for(int i=0; i<nums.length-1; i++){
        //     if((nums.length-1)%nums[0]==0){
        //         return nums[0];
        //     }
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return 1;