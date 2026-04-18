class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = len(board)
        cols= len(board[0])
        dup_row = defaultdict(set)
        dup_col = defaultdict(set)
        square = defaultdict(set)

        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    continue
                if(board[r][c] in dup_row[r] or
                   board[r][c] in dup_col[c] or
                   board[r][c] in square[(r//3, c//3)]):
                   return False
                dup_row[r].add(board[r][c])
                dup_col[c].add(board[r][c])
                square[r//3,c//3].add(board[r][c])
        return True