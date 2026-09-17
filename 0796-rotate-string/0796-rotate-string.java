class Solution {
    public boolean rotateString(String s, String goal) {

        // (s.length==goal.length || (s+s).contain(goal) )

        if(s.length()!= goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}