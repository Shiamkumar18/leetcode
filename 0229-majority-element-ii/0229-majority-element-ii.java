class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            if (list.size() == 0 || list.get(0) != nums[i] && (list.size() < 2 || list.get(1) != nums[i])) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
                if (count > n / 3) {
                    list.add(nums[i]);
                }
                if (list.size() == 2)
                    break;
            }

        }
        return list;
    }
}