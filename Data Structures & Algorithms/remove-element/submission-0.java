class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=1,n=nums.length;
        while(j<n){
            if(nums[i]==val){
                if(nums[j]==val){
                    j++;
                }
                else{
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j++;
                }
            }
            else{
                i++;
                j++;
            }
        }

        int ans=0;
        for(int num:nums){
            if(num==val){
                break;
            }
            ans++;
        }
        return ans;
    }
}