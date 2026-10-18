class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] str = s.toCharArray();
        
        for (int i = 0; i < str.length/2; i++) {
            if (str[i] != str[str.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
