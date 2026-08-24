class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i =0;  
        // if (nums[i]==nums[j]) so do not change the i just move the j++;
            for(int j=i+1; j<n; j++){
                if(nums[j]!=nums[i]){
                    nums[i+1]=nums[j];
                    i++;
                }
            }
        
        return i+1;
    }
}