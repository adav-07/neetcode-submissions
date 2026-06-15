class Solution {
    private boolean doesExist(String word, int index, char[][] board, boolean[][] visited, int i , int j, int m, int n){
        if(index==word.length()){
            return true;
        }
        if(i==m || j==n || i==-1 || j==-1){
            return false;
        }
        if(board[i][j]==word.charAt(index) && !visited[i][j]){
            visited[i][j]=true;
            boolean exists = doesExist(word, index+1, board, visited, i+1,j,m,n)
            || doesExist(word, index+1, board, visited, i-1,j,m,n)
            || doesExist(word, index+1, board, visited, i,j+1,m,n)
            || doesExist(word, index+1, board, visited, i,j-1,m,n);
            visited[i][j]=false;
            return exists;
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int i, j, m=board.length, n=board[0].length;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                boolean[][] visited = new boolean[m][n];
                if(board[i][j]==word.charAt(0)){
                    if(doesExist(word, 0, board, visited, i, j, m, n)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}