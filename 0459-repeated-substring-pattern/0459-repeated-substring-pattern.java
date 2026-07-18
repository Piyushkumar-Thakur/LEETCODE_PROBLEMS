class Solution {
    public boolean repeatedSubstringPattern(String s) {
         String f = s + s;
        return f.substring(1, f.length() - 1).contains(s);
    }
}
        // String t = s + s;
        // return t.substring(1, t.length() - 1).contains(s);