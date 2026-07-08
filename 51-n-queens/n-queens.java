class Solution {
    public List<List<String>> solveNQueens(int n) {
       
       List<List<String>> ls = new ArrayList<>();

       char[][] board = new char[n][n];

       for(int i=0;i<n;i++){
        Arrays.fill(board[i],'.');
       }

       dis(0,board,ls,n);
       return ls;
    }

    static void dis(int row, char[][] board, List<List<String>> ls, int n){
        if(row==n){
            ls.add(construct(board));
            return;
        }

        for(int col=0;col<n;col++){
            if(checkMate(row,col,board,n)){
                board[row][col]='Q';
                 dis(row+1,board,ls,n);
            board[row][col]='.';
            }

           
        }

    }

    static boolean checkMate(int row, int col, char[][] board, int n){
        //up

        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //left diagonal

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }

        //right diagonal

        for(int i=row-1,j=col+1;i>=0&& j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }

// adding list of string that is satisfied
    static List<String> construct (char[][] board){
        List<String> internal = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            internal.add(new String(board[i]));
        }
        return internal;
    }
}