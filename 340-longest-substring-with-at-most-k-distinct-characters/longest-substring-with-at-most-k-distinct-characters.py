class Solution:
    def lengthOfLongestSubstringKDistinct(self, s: str, k: int) -> int:

        l=0
        res = 0
        charset = {}
        unique =0

        for r in range(len(s)):
            charset[s[r]] = 1+charset.get(s[r],0)
            if charset[s[r]] == 1:
                unique +=1
            
            while unique > k:
                charset[s[l]] -=1
                if charset[s[l]] == 0:
                    unique -=1
                l+=1


            res = max(res, r-l+1)

        return res
        