class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [-x for x in stones]
        heapq.heapify(stones)
        while len(stones)>1:
            a = -heapq.heappop(stones)
            b = -heapq.heappop(stones)
            if abs(a) > abs(b):
                heapq.heappush(stones,-(a-b) )
        stones.append(0)
        return abs(stones[0])
                
                

        