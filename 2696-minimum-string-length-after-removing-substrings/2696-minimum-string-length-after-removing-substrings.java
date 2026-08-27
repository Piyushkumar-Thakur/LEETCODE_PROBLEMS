class Solution {
    public int minLength(String s) {
        StringBuilder st = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = st.length();
            if (n > 0 && ((st.charAt(n - 1) == 'A' && c == 'B') ||
                          (st.charAt(n - 1) == 'C' && c == 'D'))) {
                st.deleteCharAt(n - 1);
            } else {
                st.append(c);
            }
        }
        return st.length();
    }
}