class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
         
         rev(matrix);


    }

    static void rev(int[][] matrix){
        int n = matrix.length;

        for(int i=0;i<n;i++){

            int[] row = matrix[i];
            int s = row.length;
            int left=0,right=s-1;

            while(left<right){
                int temp = row[left];
                row[left]= row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
    }
}