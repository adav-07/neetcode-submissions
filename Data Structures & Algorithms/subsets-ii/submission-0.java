class Solution {
    private void generateSubsets(int index, int n, int[] nums, List<Integer> subset, Set<List<Integer>> subsets)
    {
        if(index==n){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        generateSubsets(index+1, n, nums, subset, subsets);
        subset.remove(subset.size()-1);
        generateSubsets(index+1, n, nums, subset, subsets);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsetList = new ArrayList<>();
        Set<List<Integer>> subsets = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(0, nums.length, nums, subset, subsets);
        for(List<Integer> subsett: subsets){
            subsetList.add(subsett);
        }

        return subsetList;
    }
}