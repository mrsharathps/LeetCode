class Solution {
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){ return 0;}

        int profit = 0;
        int sellDay = 0;
        int buyDay =prices[0];

        for(int i=1; i<prices.length; i++){

            if(buyDay > prices[i]){
                buyDay=prices[i];
            }
            else {
                profit = Math.max(profit, prices[i] - buyDay);
            }

        }
        return profit;
        
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}