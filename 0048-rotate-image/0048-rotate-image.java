class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        
        for(int i =0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            int start=0;  // start = start of the row 
            int end=n-1;  // end = end of the row

            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;

            }
        }
    }   
}