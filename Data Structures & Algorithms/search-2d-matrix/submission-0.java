class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n=matrix[0].length, l=0,h=m-1;
        int[] arr=matrix[0];
        while(l<=h){
            int mid = l+(h-l)/2;
            arr=matrix[mid];
            if(arr[0]<=target && arr[n-1]>=target){
                break;
            }
            else if(target>arr[n-1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }

        l=0;
        h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target>arr[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}
