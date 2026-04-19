class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        indicesstore = {}

        for i,n in enumerate(numbers):
            diff = target - n
            if diff in indicesstore:
                return [indicesstore[diff], i+1]
            indicesstore[n] = i+1
            print(indicesstore)
        



        