class Solution {
    public int maxSubArray(int[] arr) {
         int n =  arr.length;
         int maxi= Integer.MIN_VALUE;
         int sum =0;
        for(int i=0; i<n; i++){
           sum=sum+arr[i];
           if(sum>maxi){
            maxi=sum;
           } 
           if(sum<0){
            sum=0;
           }
        }
        return maxi;
    }
}