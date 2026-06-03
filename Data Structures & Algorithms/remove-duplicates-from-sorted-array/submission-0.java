class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,n=nums.length;
        while(j<n){
            if(nums[i]>=nums[j]){
                j++;
            }
            else{
                int temp = nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        for(i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                return i;
            }
        }
        return nums.length;
    }
}