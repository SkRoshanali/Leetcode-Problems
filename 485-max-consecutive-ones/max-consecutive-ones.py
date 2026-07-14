class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        c = p = 0
        for i in nums:
            if i == 1:
                c += 1
            else:
                p = max(p,c)
                c = 0
        return max(p,c)
        