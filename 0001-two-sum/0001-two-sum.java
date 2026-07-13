class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int j=target-nums[i];
            if(map.containsKey(j))
            return new int[]{map.get(j), i};
            map.put(nums[i], i);
        }
        return null;
    }
}

        // int i=0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[i]+nums[j]==target){
        //    return new int[]{i,j};
        // }
        // i++;
        // }
        // return new int[i,j];


        // Map<Integer, Integer>map=new HashMap<>();
        // for(int i=0; i<nums.length;  i=i+1){
        //     int lookingFor=target-nums[i];
        //     if(map.containsKey(lookingFor)){
        //         return new int[]{
        //             i,
        //             map.get(lookingFor)
        //         };
        //     }
        //     map.put(nums[i], i);
        // }
        // return new int[]{
        //     -1 
        // };