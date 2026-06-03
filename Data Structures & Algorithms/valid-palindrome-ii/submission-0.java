class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s, false);
    }

    private boolean isPalindrome(String s, boolean isSplitted){
        int n = s.length();
        if(n==0 || n==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(n-1)){
            return isPalindrome(s.substring(1, n-1), isSplitted);
        }
        else if(!isSplitted){
            return isPalindrome(s.substring(0, n-1), true) || isPalindrome(s.substring(1, n), true);
        }
        else{
            return false;
        }
    }
}