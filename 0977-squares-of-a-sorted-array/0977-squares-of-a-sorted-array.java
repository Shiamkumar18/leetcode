class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int [nums.length];
        int left =0;
        int right=nums.length-1;
        int k = nums.length-1; 
        // k for tracking the index of the largest element because which one the most largest element that will fill in the last.

        while(left<=right){

            int leftSquare= nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare<rightSquare){
                ans[k]=rightSquare;
                right--;
            } else{
                ans[k]=leftSquare;
                left++;
            }
            k--;
        }
        return ans ;
    }
}