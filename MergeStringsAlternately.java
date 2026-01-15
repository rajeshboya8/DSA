class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int left=0,right=0;
        StringBuilder ans=new StringBuilder();
        while(left<n && right<m){
            ans.append(word1.charAt(left++));
            ans.append(word2.charAt(right++));
        }
        while(left<n){
            ans.append(word1.charAt(left++));
        }
        while(right<m){
            ans.append(word2.charAt(right++));
        }
        return ans.toString();        
    }
}
