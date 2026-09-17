class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                int length = right - left + 1;
                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    answer = Math.min(answer,
                            best[left - 1] + length);
                }
                minLength = Math.min(minLength, length);
            }
            if (right == 0) {
                best[right] = minLength;
            } else {
                best[right] = Math.min(best[right - 1], minLength);
            }
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}


        // for(int i=0; i<arr.length; i++){
        //     int count=0;
        //     if(nums[i]==target){
        //         count ++;
        //     }
        // }
        // return count