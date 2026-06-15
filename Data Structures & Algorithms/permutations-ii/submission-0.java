class Solution {
    private void generateSubsets(int index, int n, int[] nums, boolean[] visited, List<Integer> subset, Set<List<Integer>> subsets)
    {
        if(index==n){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i]=true;
                subset.add(nums[i]);
                generateSubsets(index+1, n, nums, visited, subset, subsets);
                subset.remove(subset.size()-1);
                visited[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> subsetList = new ArrayList<>();
        Set<List<Integer>> subsets = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        generateSubsets(0, nums.length, nums, visited, subset, subsets);

        for(List<Integer> list:subsets){
            subsetList.add(list);
        }

        return subsetList;
    }
}