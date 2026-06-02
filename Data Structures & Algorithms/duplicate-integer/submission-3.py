class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        d = {}

        for i in range(len(nums)):
            if nums[i] in d:
                d[nums[i]] += 1
            else:
                d[nums[i]] = 1

        for key in d:
            if d[key] > 1:
                return True
        return False