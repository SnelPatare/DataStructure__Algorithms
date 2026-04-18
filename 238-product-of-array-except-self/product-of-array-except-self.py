class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix = [1]*n
        postfix = [1]*n
        output = [1]*n
        for i in range(1,len(nums)):
            prefix[i] = nums[i-1]*prefix[i-1]
        for i in range(len(nums)-2,-1,-1):
            postfix[i] = nums[i+1] * postfix[i+1]
        for i in range(len(nums)):
            output[i] = prefix[i]*postfix[i]
        return output