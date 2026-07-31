class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rsize = matrix.length;
        int csize = matrix[0].length;

        if(rsize==1){
            return true;
        }

        for(int i=1;i<rsize;i++){
            for(int j=1;j<csize;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }

        return true;
    }
}