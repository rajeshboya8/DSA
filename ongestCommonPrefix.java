class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String start=strs[0];
        String end=strs[n-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!=end.charAt(i)){
                break;
            }
            else{
                ans.append(start.charAt(i));
            }
        }
        return ans.toString();        
    }
}
