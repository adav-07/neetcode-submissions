class Solution {
    private void generateSubsets(int[] nums, int index, int sum, int target, List<Integer> subset, Set<List<Integer>> subsets){
        if(sum==target){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[index]){
                continue;
            }

            if(sum+nums[i]>target){
                break;
            }
            subset.add(nums[i]);
            generateSubsets(nums, i+1, sum+nums[i], target, subset, subsets);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> subset = new ArrayList<>();

        generateSubsets(candidates, 0, 0, target, subset, set);
        List<List<Integer>> subsets = new ArrayList<>();
        for(List<Integer> subsett: set){
            subsets.add(subsett);
        }

        return subsets;
    }
}
