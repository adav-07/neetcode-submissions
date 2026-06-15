class Solution {
    private void generateSubsets(int index, int n, int[] nums, Set<Integer> hs, List<Integer> subset, List<List<Integer>> subsets){
        if(index==n){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                subset.add(nums[i]);
                generateSubsets(index+1, n, nums, hs, subset, subsets);
                subset.remove(subset.size()-1);
                hs.remove(nums[i]);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        generateSubsets(0, nums.length, nums, set, subset, subsets);

        return subsets;
    }
}
