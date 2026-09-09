class Solution {
    public long countCommas(long n) {
        long ans = 0;
        for (long x = 1000; x <= n; x *= 1000) {
            ans += n - x + 1;
        }
        return ans;
    }
}
       
       
        //return Math.max(n-999,0);


    //     long first = Math.max(0, n - 999);
    //     long second = Math.max(0, n - 999999);
    //    // long third = Math.max(0,n-9999999);

    //     return first + second;