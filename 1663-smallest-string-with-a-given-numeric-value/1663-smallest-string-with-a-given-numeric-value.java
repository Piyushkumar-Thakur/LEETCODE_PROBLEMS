class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 'a';
        }
        k = k - n; 
        
        int i = n - 1;
        while (k > 0) {

            int add = Math.min(25, k);
            ans[i] = (char)(ans[i] + add);

            k = k - add;
            i--;
        }
        return new String(ans);
    }
}