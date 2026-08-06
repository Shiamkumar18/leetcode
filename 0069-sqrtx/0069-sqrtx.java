class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int lo=1;
        int hi=x;
        int ans = 1;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(((long)mid*mid<=x)){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans ;
    }
}