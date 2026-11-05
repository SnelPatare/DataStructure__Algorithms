class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        int r = grid.length;
        int c = grid[0].length;

        for(int m = 0; m <r; m++){
            for(int n =0; n <c; n++){
                if(grid[m][n] == '1'){
                    count++;
                    dfs(m,n,grid);
                }
            }
        }
        return count;
        
    }

    public void dfs(int r, int c, char[][] grid){
        if(r<0|| c<0 || r >= grid.length || c>= grid[0].length || grid[r][c]!= '1'){
            return;
        }
        grid[r][c] = '0';
        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
        dfs(r,c-1,grid);
        dfs(r,c+1,grid);
    }
}