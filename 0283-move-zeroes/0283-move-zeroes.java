class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
       }
    }
