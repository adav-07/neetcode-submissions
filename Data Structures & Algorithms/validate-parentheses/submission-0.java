class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='[' || c =='(' || c =='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char peek = st.peek();
                if((peek=='(' && c==')') || (peek=='{' && c=='}') || (peek=='[' && c==']')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
