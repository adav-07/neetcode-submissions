class Solution {
    public int majorityElement(int[] nums) {
        int elem=nums[0];
        int val=1, j=1;
        while(j<nums.length){
            if(val==0){
                elem=nums[j];
            }
            if(nums[j]==elem){
                val++;
                j++;
            }
            else{
                val--;
                j++;
            }
        }
        return elem;
    }
}