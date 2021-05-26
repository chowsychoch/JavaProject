package udemy.leetCode;

public class BestTimetoBuynSellStock {
    public int maxProfit(int[] prices) {
        int max =0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i < prices.length ; i++){
            if (prices[i] < min){
                min =prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }

        }
        System.out.println(max);
        return max;
    /*

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i =0; i < prices.length -1; i++){
            for(int j = i +1; j < prices.length ; j++){
                int current = prices[j] - prices[i];
                if (current > profit){
                    profit = current;
                }
            }
        }
        //System.out.println("Profit is " + profit);
        return profit;*/

    }

}
