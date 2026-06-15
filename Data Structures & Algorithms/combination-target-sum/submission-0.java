class Solution {
    private void generateSubsets(int[] nums, int index, int sum, int target, List<Integer> list, Set<List<Integer>> subsets){
        if(sum==target){
            subsets.add(new ArrayList<>(list));
            return;
        }

        if(index==nums.length || sum>target){
            return;
        }

        list.add(nums[index]);
        generateSubsets(nums, index, sum+nums[index], target, list, subsets);
        list.remove(list.size()-1);
        generateSubsets(nums, index+1, sum, target, list, subsets);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> subsets = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(candidates, 0, 0, target, subset, subsets);

        List<List<Integer>> subsetList = new ArrayList<>();
        for(List<Integer> subsett:subsets){
            subsetList.add(subsett);
        }

        return subsetList;
    }
}
