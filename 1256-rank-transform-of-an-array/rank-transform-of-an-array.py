class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        se = sorted(list(set(arr)))
        rank_map = {}
        i = 1
        for num in se:
            rank_map[num] = i
            i += 1
        result = []
        for num in arr:
            result.append(rank_map[num])
        return result