class Solution {
    public String FindUniqueCode(String s){
        int[] alpha = new int[26];
        for(char c:s.toCharArray()){
            alpha[c-'a']+=1;
        }

        String val="";
        for(int i=0;i<26;i++){
            val+=alpha[i]+'a';
        }
        return val;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        for(String s: strs){
            String uniqueCode = FindUniqueCode(s);
            if(!hm.containsKey(uniqueCode)){
                List<String> list = new ArrayList<String>();
                list.add(s);
                hm.put(uniqueCode,list);
            }
            else{
                List<String> list = hm.get(uniqueCode);
                list.add(s);
                hm.put(uniqueCode,list);
            }
        }

        List<List<String>> returnList = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: hm.entrySet()){
            List<String> list = entry.getValue();
            returnList.add(list);
        }

        return returnList;
    }
}
