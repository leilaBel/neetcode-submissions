class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int diff = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j != k) {
                if (nums[j] + nums[k] > diff) {
                    k--;
                }
                else if (nums[j] + nums[k] < diff) {
                    j++;
                }
                else if (nums[j]+nums[k] == diff) {
                    List<Integer> solution = new ArrayList<Integer> (
                        List.of(nums[i], nums[j], nums[k])
                    );
                    if (!result.contains(solution)) {
                        result.add(solution);
                    }
                    j++;
                }
            }
        }
        return result;
    }
}
