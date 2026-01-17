class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h=new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> i: h.entrySet()){
            if(i.getValue()==1){
                char a=i.getKey();
                return s.indexOf(a);
            }
        }
        return -1;
    }
}
