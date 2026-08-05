class Solution {
    public int[] searchRange(int[] arr, int tar) {
        int [] ans = new int [2];

        // for the First Position of Element
        int low =0;
        int hi=arr.length-1;
        int index = -1;

        while(low<=hi){
            int mid = low+(hi-low)/2;
            if(arr[mid]==tar){
                index=mid;
                hi=mid-1;
            } else if (arr[mid]>tar){
                hi=mid-1;
            } else {
                low=mid+1;
            }
        }

        ans[0]=index;

        // last Position of Element 
        low =0;
        hi=arr.length-1;
        index = -1;

        while(low<=hi){
            int mid = low +(hi-low)/2;
            if(arr[mid]==tar){
                index=mid;
                low=mid+1;
            } else if (arr[mid]<tar){
                low=mid+1;
            } else{
                hi=mid-1;
            }
        }
        ans[1]=index;
        return ans;
    }
}