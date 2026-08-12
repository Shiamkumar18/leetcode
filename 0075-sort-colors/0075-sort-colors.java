class Solution {
    public void sortColors(int[] nums) {
        int n =nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            } else{
                mid++;
            }
        }
    }

    public void swap(int[]num , int first , int second){
        int temp=num[first];
        num[first]=num[second];
        num[second]=temp;
    }
}