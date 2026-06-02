class Solution {
    public boolean isAnagram(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();
        String one = s;
        String two = t;
        if(length1<length2){
            one = t;
            two = s;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(char c: one.toCharArray()){
            if(hm1.containsKey(c)){
                int val = hm1.get(c);
                hm1.put(c, val+1);
            }
            else{
                hm1.put(c, 1);
            }
        }

        for(char c: two.toCharArray()){
            if(hm2.containsKey(c)){
                int val = hm2.get(c);
                hm2.put(c, val+1);
            }
            else{
                hm2.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hm1.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();

            if(!hm2.containsKey(key)){
                return false;
            }

            if(val!=hm2.get(key)){
                return false;
            }
        }
        return true;
    }
}
