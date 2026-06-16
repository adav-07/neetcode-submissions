class Solution {
    private int findIslands(int i, int j, int m, int n, int[][] grid, boolean[][] visited){
        if(i==-1 || i==m || j==-1 || j==n){
            return 0;
        }

        if(!visited[i][j] && grid[i][j]==1){
            visited[i][j]=true;
            return 1+
            findIslands(i, j-1, m, n, grid, visited)+
            findIslands(i, j+1, m, n, grid, visited)+
            findIslands(i+1, j, m, n, grid, visited)+
            findIslands(i-1, j, m, n, grid, visited);
        }
        return 0;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int i, j, m=grid.length, n= grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int max=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    max = Math.max(max, findIslands(i, j, m, n, grid, visited));
                }
            }
        }
        return max;
    }
}
