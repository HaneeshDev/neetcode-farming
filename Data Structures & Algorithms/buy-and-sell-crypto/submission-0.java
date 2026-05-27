class Solution {
    public int maxProfit(int[] prices) {


        int profit = 0; 


        for(int i = 0; i< prices.length; i++){
            for(int j = i+ 1; j < prices.length; j++){
                if(j > i){
                     int res = prices[j] - prices[i];

                     if(res > profit){
                        profit = res;
                     }
                }
            }

        }

        return profit;
        
    }
}
