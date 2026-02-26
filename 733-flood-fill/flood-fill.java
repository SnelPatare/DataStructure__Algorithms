class Solution {
    private static final int[][] directions = {{1,0}, {-1,0},{0,-1}, {0,1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcolor = image[sr][sc];
        int[][] result = image;

        //for(int r = sr ; r< row; r++){
        //    for(int c = sc, c<col;c++){
                if(orgcolor != color){
                    dfs(result,sr,sc,color, orgcolor);
                }
           // }
        //}
        return result;

    }

    private void dfs(int[][] grid, int r, int c, int color, int orgcolor){
        if (r<0||c<0||r>=grid.length || c>=grid[0].length|| grid[r][c] != orgcolor){
            return;
        }
        grid[r][c] = color;
        for(int[] dir:directions){
            dfs(grid, r+dir[0], c+dir[1], color, orgcolor);
        }
    }
}