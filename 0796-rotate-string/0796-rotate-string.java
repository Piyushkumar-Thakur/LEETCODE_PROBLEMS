class Solution {
    public boolean rotateString(String s, String goal) {
        String rotate=s+s;
        if(s.length()!=goal.length()){
            return false;
        }
        return rotate.contains(goal);
    }
}