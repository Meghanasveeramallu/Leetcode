class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        size = len(prices)
        profit = 0
        cost = 99876543
        for price in prices:
            cost = min(cost, price)
            profit = max(profit, price - cost)
        return profit
        
