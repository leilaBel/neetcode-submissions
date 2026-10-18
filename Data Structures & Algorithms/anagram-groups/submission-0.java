class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> listMap = new HashMap<>();
        for (String str : strs) {
            HashMap<Character, Integer> strMap = new HashMap<>();
            char[] strArray = str.toCharArray();
            for (char c : strArray) {
                if (strMap.containsKey(c)) {
                    strMap.put(c, strMap.get(c)+1);
                }
                else {
                    strMap.put(c,1);
                }
            }
            listMap.computeIfAbsent(strMap, k-> new ArrayList<>()).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> array : listMap.values()) {
            result.add(array);
        }
        return result;
    }
}
