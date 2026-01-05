class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(map.containsKey(sum)){
                int a=map.get(sum);
                int b=i;
                return a>b? new int[]{a,b}:new int[]{b,a};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
