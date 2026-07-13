class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("", 0, 0, n, ans);
        return ans;
    }
    public void helper(String s, int open, int close, int n, List<String> ans) {

        //This is for Base case
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        // Add '(' if onen is less than n
        if (open < n) {
            helper(s + "(", open + 1, close, n, ans);
        }

        // Add ')'
        if (close < open) {
            helper(s + ")", open, close + 1, n, ans);
        }
    }
}