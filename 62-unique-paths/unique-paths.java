class Solution {
    public int uniquePaths(int m, int n) {
        int ans[][] = new int[m][n];
        
        //Indexed based looping
        for(int i=0;i<ans.length;i++){
            Arrays.fill(ans[i],-1);
        }

        return uni(0, 0, m, n, ans);
    }

    public int uni(int i, int j, int m, int n, int[][] ans) {

        // Destination reached
        if (i == m - 1 && j == n - 1)
            return 1;

        if(ans[i][j]!=-1)
            return ans[i][j];

        int r = 0, d = 0;

        if (j + 1 < n) {
            r = uni(i, j + 1, m, n, ans);
        }

        if (i + 1 < m) {
            d = uni(i + 1, j, m, n, ans);
        }

        return ans[i][j] = r + d;
    }
}