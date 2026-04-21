class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key = lambda i : i[0])
        count = 0
        output = [intervals[0]]

        for start, end in intervals[1:]:
            lastend = output[-1][1]
            if lastend > start:
                count+=1
                output[-1][1] = min(lastend, end)      
            else:
                output.append([start,end])

        return count 
        