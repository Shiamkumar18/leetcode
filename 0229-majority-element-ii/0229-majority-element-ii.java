class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && element2!=nums[i]) {
                count1 = 1;
                element1 = nums[i];
            } else if (count2 == 0 && element1!=nums[i]) {
                count2 = 1;
                element2 = nums[i];
            } else if (nums[i] == element1) {
                count1++;
            } else if (nums[i] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
         count1=0; count2=0;
         for(int i=0; i<n; i++){
            if(nums[i]==element1) count1++;
            if(nums[i]==element2) count2++;
         }

         int mini = n/3+1;  // mini = minimum required count 
        
        List<Integer> ans = new ArrayList<>();

        if(count1>=mini) ans.add(element1);
        if(count2>=mini && element2!=element1) ans.add(element2);
        return ans;
    }
}