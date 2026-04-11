class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int col = grid[0].length; 

        for(int r =0; r < rows; r++){
            for(int c =0; c < col; c++){
                if(grid[r][c] == '1'){
                    count++;
                    dfs(r,c,grid);
                }
                
            }
        }
        return count;
        
    }

    public void dfs(int r, int c, char[][] grid){
        if(r <0 || c<0|| r >= grid.length || c >= grid[0].length || grid[r][c] != '1' ){
            return;
        }
        grid[r][c] = '0';
        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);

    }
}