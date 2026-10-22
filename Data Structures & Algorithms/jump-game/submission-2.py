class Solution:
    def canJump(self, nums: List[int]) -> bool:
        goal = len(nums)-1
        for i in range(len(nums)-2,-1,-1):
            if nums[i] + i >= goal :
                goal = i
            i+= 1
        return goal == 0            
        