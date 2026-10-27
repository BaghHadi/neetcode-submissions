class Solution:
    def countBits(self, n: int) -> List[int]:
        res = [0]*(n+1)
        
        for i in range(n+1):
            j= i
            r=0
            while (j):
                j &= (j-1)
                r+=1
            res[i]=r
        return res

        