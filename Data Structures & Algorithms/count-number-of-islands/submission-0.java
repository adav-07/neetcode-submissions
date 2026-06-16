class Solution {
    private void findIslands(int i, int j, int m, int n, char[][] grid, boolean[][] visited){
        if(i==-1 || i==m || j==-1 || j==n){
            return;
        }

        if(!visited[i][j] && grid[i][j]=='1'){
            visited[i][j]=true;
            findIslands(i, j-1, m, n, grid, visited);
            findIslands(i, j+1, m, n, grid, visited);
            findIslands(i+1, j, m, n, grid, visited);
            findIslands(i-1, j, m, n, grid, visited);
        }
    }
    public int numIslands(char[][] grid) {
        int i, j, m=grid.length, n= grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int sum=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    findIslands(i, j, m, n, grid, visited);
                    sum+=1;
                }
            }
        }
        return sum;
    }
}
