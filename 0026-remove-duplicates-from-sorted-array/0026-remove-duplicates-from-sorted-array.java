class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        // if (nums[i]==nums[j]) so do not change the i just move the j++;
        for (int j = i + 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}