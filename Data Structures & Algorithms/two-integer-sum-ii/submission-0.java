class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int result = numbers[i] + numbers[j];
        while (i != j && result != target) {
            //int mid = (i+j)/2;
            result = numbers[i] + numbers[j];
            if (result > target) {
                j--;
            }
            else if (result < target) {
                i++;
            }
        }
        return new int[]{i+1,j+1};
    }
}
