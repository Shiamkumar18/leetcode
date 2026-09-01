class Solution {
    public int removeDuplicates(int[] nums) {
        

        int k =0;
        for(int j=0; j<nums.length; j++){
            if(k<2 || nums[j]!=nums[k-2]){
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}