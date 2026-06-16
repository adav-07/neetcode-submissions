class Solution {
    public int islandPerimeter(int[][] grid) {
        int i,j,m=grid.length,n=grid[0].length, perimeter=0;

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){
                    perimeter+=4;
                    if(i>0 && grid[i-1][j]==1){
                        perimeter-=1;
                    }
                    if(i<m-1 && grid[i+1][j]==1){
                        perimeter-=1;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        perimeter-=1;
                    }
                    if(j<n-1 && grid[i][j+1]==1){
                        perimeter-=1;
                    }
                } 
            }
        }

        return perimeter;
    }
}