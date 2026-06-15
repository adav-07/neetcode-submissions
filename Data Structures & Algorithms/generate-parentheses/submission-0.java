class Solution {
    private void generateParanthesis(int n, int l, int r, String s, List<String> list){
        if(r>l || r>n || l>n){
            return;
        }
        if(s.length()==n*2){
            list.add(s);
            return;
        }

        if(l<n){
            generateParanthesis(n, l+1, r, s+"(", list);
        }
        if(r<l){
            generateParanthesis(n, l, r+1, s+")", list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParanthesis(n, 1, 0, "(", list);
        return list;
    }
}
