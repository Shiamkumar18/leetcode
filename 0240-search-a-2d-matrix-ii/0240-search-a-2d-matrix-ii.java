class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n =matrix.length;
        int m = matrix[0].length;
        

        for(int i =0; i<n; i++){
            if(binarySearch(matrix[i],target)){
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(int [] matrix , int target){
        int lo=0;
        int hi=matrix.length-1;

        while(lo<=hi){
            int mid= lo+(hi-lo)/2;

            if(matrix[mid]==target){
                return true;
            } else if(matrix[mid]<target){
                lo=mid+1;
            } else {
                hi=mid-1;
            }
        }
        return false;
    }    
}