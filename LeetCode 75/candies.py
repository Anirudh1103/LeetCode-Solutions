class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []
        max_candies = max(candies)
        for i in candies:
            if(i + extraCandies >= max_candies):
                result.append(True)
            else:
                result.append(False)

        return result
        