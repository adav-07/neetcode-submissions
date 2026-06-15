class Solution {
    private void generateSubsets(int[] nums, int index, int sum, int target, List<Integer> list, List<List<Integer>> subsets){
        if(sum==target){
            subsets.add(new ArrayList<>(list));
            return;
        }

        if(index==nums.length || sum>target){
            return;
        }

        list.add(nums[index]);
        if(sum+nums[index]<=target){
            generateSubsets(nums, index, sum+nums[index], target, list, subsets);
        }
        list.remove(list.size()-1);
        generateSubsets(nums, index+1, sum, target, list, subsets);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(candidates, 0, 0, target, subset, subsets);

        return subsets;
    }
}
