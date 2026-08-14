class Solution:
    def trap(self, height: List[int]) -> int:
        if not height : return 0
        l,r =0, len(height)-1
        MaxL,MaxR=height[l],height[r]
        res = 0
        while l < r :
            if MaxL < MaxR :
                l+=1
                MaxL = max(MaxL,height[l])
                res += MaxL - height[l]
            else : 
                r-=1
                MaxR = max(MaxR,height[r])
                res += MaxR - height[r]
        return res