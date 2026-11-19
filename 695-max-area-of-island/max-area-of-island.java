class Solution {
    private static final int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int area = 0;
        for(int r =0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                if(grid[r][c] == 1){
                area = Math.max(area, dfs(r,c,grid));
                }

            }

        }
        return area;
    }

    public static int dfs(int r,int c,int[][] grid){
        if(r<0 || c<0|| r >= grid.length|| c >= grid[0].length || grid[r][c] != 1){
            return 0;
        }

        int res = 1;
        grid[r][c] = 0;
        for(int[] d: directions){
            res += dfs(r+d[0], c+d[1], grid);
        }
        return res;
    }
}