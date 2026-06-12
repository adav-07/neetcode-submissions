class Solution {
    public int mySqrt(int x) {
        int l=1,h=x;
        while(l<=h){
            int mid=l+(h-l)/2;
            long power=(long)mid*mid;
            if(power>(long)Integer.MAX_VALUE){
                h=mid-1;
                continue;
            }
            power=(int)power;
            if(power==x){
                return mid;
            }
            else if(power<x){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return h;
    }
}