class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        out = []
        for i in range(len(nums)):
            num = 1
            for j in range(len(nums)):
                if (i != j):
                    num *= nums[j]
            out.append(num)
        return out