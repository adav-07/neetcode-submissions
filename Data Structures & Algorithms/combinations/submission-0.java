class Solution {
    private void generateSubsets(int num, int n, int length, int k, List<Integer> subset, Set<List<Integer>> subsets){
        if(length==k){
            subsets.add(new ArrayList<>(subset));
        }

        for(int i=num;i<=n;i++){
            subset.add(i);
            generateSubsets(i+1, n, length+1, k, subset, subsets);
            subset.remove(subset.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        Set<List<Integer>> subsets = new HashSet<>();
        List<Integer> subset = new ArrayList<>();

        generateSubsets(1, n, 0, k, subset, subsets);

        List<List<Integer>> subsetList = new ArrayList<>();
        for(List<Integer> list:subsets){
            subsetList.add(list);
        }
        return subsetList;
    }
}