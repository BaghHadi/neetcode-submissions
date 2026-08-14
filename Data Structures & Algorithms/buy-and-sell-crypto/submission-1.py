class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l,r=0,1
        res = 0
        while (r<len(prices)) :
            benef = prices[r] - prices[l]
            if (benef<0) : 
                l=r
                r+=1
            else :
                res = max(res,benef)
                r+=1
        return res
        