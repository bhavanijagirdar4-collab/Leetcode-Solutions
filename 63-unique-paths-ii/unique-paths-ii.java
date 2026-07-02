class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int ans[][] = new int[grid.length][grid[0].length];
        
        //Indexed based looping
        for(int i=0;i<ans.length;i++){
            Arrays.fill(ans[i],-1);
        }
        return uniquePaths(0, 0, grid,ans);
    }

    public int uniquePaths(int i, int j, int[][] grid, int[][] ans) {

        if (grid[i][j] == 1)
            return 0;

        if (i == grid.length - 1 && j == grid[0].length - 1)
            return 1;
            
        if(ans[i][j]!=-1)
            return ans[i][j];

        int r = 0, d = 0;

        if (j + 1 < grid[0].length) {
            r = uniquePaths(i, j + 1, grid, ans);
        }

        if (i + 1 < grid.length) {
            d = uniquePaths(i + 1, j, grid, ans);
        }

        return ans[i][j] = r + d;
    }
}