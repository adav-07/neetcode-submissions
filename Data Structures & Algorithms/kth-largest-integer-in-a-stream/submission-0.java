class KthLargest {
    List<Integer> list;
    int k;
    public KthLargest(int k, int[] nums) {
        list = new ArrayList<>();
        this.k=k;
        initialize(list, nums);
    }

    private void initialize(List<Integer> list, int[] nums){
        int n = nums.length;
        if(n==0){
            return;
        }
        list.add(nums[0]);
        for(int i=1;i<n;i++){
            int index=findIndex(nums[i], list);

            if(index==list.size()){
                list.add(nums[i]);
            }
            else if(index==-1){
                list.add(0, nums[i]);
            }
            else{
                list.add(index, nums[i]);
            }
        }
    }
    
    public int add(int val) {
        int index = findIndex(val, list);
        if(index==list.size()){
            list.add(val);
        }
        else if(index==-1){
            list.add(0, val);
        }
        else{
            list.add(index, val);
        }
        return list.get(list.size()-k);
    }

    private int findIndex(int num, List<Integer> nums){
        int l=0, h=nums.size()-1,mid;
        while(l<=h){
            mid=l+(h-l)/2;
            if(nums.get(mid)==num){
                return mid;
            }
            else if(nums.get(mid)>num){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
