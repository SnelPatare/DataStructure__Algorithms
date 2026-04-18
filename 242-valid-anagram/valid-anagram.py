class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freq = {}
        freq1 = {}
        for i in s:
            freq[i] = 1+freq.get(i,0)

        for j in t:
            freq1[j] = 1+freq1.get(j,0)

        return freq == freq1
        