class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        
        long lo=1;
        long hi=x;
        long ans = 1;

        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if((mid*mid<=x)){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return (int) ans ;
    }
}