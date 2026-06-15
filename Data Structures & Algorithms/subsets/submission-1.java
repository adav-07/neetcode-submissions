class Solution {
    private void generateSubsets(int[] nums, int index, List<Integer> list, Set<List<Integer>> set){
        if(index==nums.length){
            set.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        generateSubsets(nums, index+1, list, set);
        list.remove(list.size()-1);
        generateSubsets(nums, index+1, list, set);
    }
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        generateSubsets(nums, 0, list, set);

        List<List<Integer>> subsets = new ArrayList<>();
        for(List<Integer> subset:set){
            subsets.add(subset);
        }
        return subsets;
    }
}
