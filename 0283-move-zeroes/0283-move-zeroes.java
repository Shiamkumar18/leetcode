class Solution {
    public void moveZeroes(int[] arr) {
        for (int j = 0; j <arr.length ; j++) {
           for (int k = j+1; k < arr.length; k++) {
               if (arr[j]==0){
                   int temp = arr[j];
                   arr[j]=arr[k];
                   arr[k]=temp;
               }
           }
       }
    }
}