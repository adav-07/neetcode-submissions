class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i=0,j=1,max=0,dif=0;
        int minprice=Integer.MAX_VALUE;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }
            dif=price-minprice;
            max=Math.max(dif,max);
        }
        return max;
    }
}
