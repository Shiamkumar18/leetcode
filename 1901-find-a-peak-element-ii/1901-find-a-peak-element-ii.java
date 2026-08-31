class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int lo=0;
        int hi=m-1;

        while(lo<=hi){
            int mid= lo+(hi-lo)/2;

            // find the maximum element of the mid row 
            int row = Max_Element(mat, mid);

            int left;
            if(mid-1>=0){
                left=mat[row][mid-1];
            } else {
                left=Integer.MIN_VALUE;
            }
            int right;
            if(mid+1<m){
                right=mat[row][mid+1];
            } else {
                right=Integer.MIN_VALUE;
            }

            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int [] {row, mid};
            } else if (mat[row][mid]<left){
                hi=mid-1;
            } else {
                lo=mid+1;
            }
        }
         return new int [] {-1,-1};
    }

    private int Max_Element(int[][] arr, int col){
        int n = arr.length;
        int max= Integer.MIN_VALUE;
        int index =-1;

        for(int i=0; i<n; i++){
            if(arr[i][col]>max){
                max=arr[i][col];
                index=i;
            }
        }
        return index;
    }
}