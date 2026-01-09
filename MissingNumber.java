class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        n=(n*(n+1))/2;
        return n-sum;
    }
}
