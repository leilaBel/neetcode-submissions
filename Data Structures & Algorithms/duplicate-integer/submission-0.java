class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int element : nums) {
            if (!seen.add(element)) {
                return true;
            }
        }
        return false;
    }
}