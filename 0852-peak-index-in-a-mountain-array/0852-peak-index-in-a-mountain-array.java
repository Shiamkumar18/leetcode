class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo =1;
        int hi=arr.length-2;

        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            else  if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                lo=mid+1;
            } else {
                hi=mid-1;
            }
        }
        return 67537;
    }
}