class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();

        for(String s:strs){
            int len = s.length();
            if(len<min){
                min=len;
            }
        }

        int val = 0;
        for(int i=0;i<min;i++){
            char c = strs[0].charAt(i);
            for(int j = 1;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    return strs[0].substring(0, val);
                }
            }
            val+=1;
        }

        return strs[0].substring(0, val);
    }
}