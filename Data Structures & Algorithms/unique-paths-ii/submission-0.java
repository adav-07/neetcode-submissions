class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int i=0,j=0,m=obstacleGrid.length,n=obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        while(i<m){
            if(obstacleGrid[i][0]==1){
                break;
            }
            else{
                dp[i][0]=1;
                i++;
            }
        }
        while(j<n){
            if(obstacleGrid[0][j]==1){
                break;
            }
            else{
                dp[0][j]=1;
                j++;
            }
        }

        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(obstacleGrid[i][j]==0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[m-1][n-1];
    }
}