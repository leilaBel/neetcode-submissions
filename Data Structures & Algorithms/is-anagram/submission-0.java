class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashT = new HashMap<Character, Integer>();

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        for (char c : sArray) {
            if (hashS.containsKey(c)) {
                hashS.put(c, hashS.get(c)+1);
            }
            else {
                hashS.put(c,1);
            }
        }

        for (char c : tArray) {
            if (hashT.containsKey(c)) {
                hashT.put(c, hashT.get(c)+1);
            }
            else {
                hashT.put(c,1);
            }
        }

        if (hashS.equals(hashT)) {
            return true;
        }
        return false;
    }
}
