class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!isAlphaNum(left)) {
                i++;
            } else if (!isAlphaNum(right)) {
                j--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isAlphaNum (char c){
        return(c>='a' && c<='z')||
            (c>='A' && c<='Z')||
            (c>='0' && c<='9');
    }
}