/*
Problem:
Given an array of stock prices, find the maximum profit by choosing
a single day to buy and a different day in the future to sell.

Approach:
- Keep track of minimum price so far
- Calculate profit at each step
- Update max profit

Time Complexity: O(n)
Space Complexity: O(1)
*/

class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
