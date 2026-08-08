class Solution {
    public int[][] transpose(int[][] matrix) {
        int rlength = matrix.length;
        int clength = matrix[0].length;

        int[][] result = new int[clength][rlength];
        for(int i=0;i<rlength;i++){
            for(int j=0;j<clength;j++){
             result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}