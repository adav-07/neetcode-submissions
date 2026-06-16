class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] votes1 = new int[n+1];
        int[] votes2 = new int[n+1];

        for(int i=0;i<trust.length;i++){
            int[] arr = trust[i];
            votes1[arr[1]]++;
            votes2[arr[0]]++;
        }

        for(int i=1;i<=n;i++){
            if(votes1[i]==n-1 && votes2[i]==0){
                return i;
            }
        }
        return -1;
    }
}