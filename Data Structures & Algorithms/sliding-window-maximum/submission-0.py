class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        res = float('-inf')
        resL = []
        l = 0
        for r in range(k):
            if nums[r] > res:
                res = nums[r]
        resL.append(res) 
        for r in range(k, len(nums)):
            l = r - k + 1
            if nums[l - 1] == res:
                res = float('-inf')
                for i in range(l, r + 1):
                    if nums[i] > res:
                        res = nums[i]
            else:
                if nums[r] > res:
                    res = nums[r]
            resL.append(res) 
        return resL