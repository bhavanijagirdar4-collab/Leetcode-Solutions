class Solution {

    static int dis(int m, int n, int i, int j,
                   List<List<Integer>> grid,
                   int health,
                   int[][] visited,
                   int[][] memo) {

        if (health <= 0)
            return -1;

        if (i == m - 1 && j == n - 1)
            return health;

        // Already visited this cell with better or equal health
        if (memo[i][j] >= health)
            return -1;

        memo[i][j] = health;

        visited[i][j] = 1;

        int ans = -1;

        // UP
        if (i - 1 >= 0 && visited[i - 1][j] == 0) {
            int h = health;
            if (grid.get(i - 1).get(j) == 1)
                h--;

            ans = Math.max(ans,
                    dis(m, n, i - 1, j, grid, h, visited, memo));
        }

        // RIGHT
        if (j + 1 < n && visited[i][j + 1] == 0) {
            int h = health;
            if (grid.get(i).get(j + 1) == 1)
                h--;

            ans = Math.max(ans,
                    dis(m, n, i, j + 1, grid, h, visited, memo));
        }

        // DOWN
        if (i + 1 < m && visited[i + 1][j] == 0) {
            int h = health;
            if (grid.get(i + 1).get(j) == 1)
                h--;

            ans = Math.max(ans,
                    dis(m, n, i + 1, j, grid, h, visited, memo));
        }

        // LEFT
        if (j - 1 >= 0 && visited[i][j - 1] == 0) {
            int h = health;
            if (grid.get(i).get(j - 1) == 1)
                h--;

            ans = Math.max(ans,
                    dis(m, n, i, j - 1, grid, h, visited, memo));
        }

        visited[i][j] = 0;

        return ans;
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        if (grid.get(0).get(0) == 1)
            health--;

        int[][] visited = new int[m][n];
        int[][] memo = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], -1);
        }

        int h = dis(m, n, 0, 0, grid, health, visited, memo);

        return h >= 1;
    }
}