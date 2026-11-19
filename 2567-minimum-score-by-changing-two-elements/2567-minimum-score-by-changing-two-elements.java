class Solution {
    public int minimizeSum(int[] nums) {
        int n=nums.length;
        if(n<=3){
            return 0;
        }
        
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        ans=Math.min(ans,nums[n-1]-nums[2]);   // change two smallest value
        ans=Math.min(ans,nums[n-2]-nums[1]);  // one smallest and one largest
        ans=Math.min(ans,nums[n-3]-nums[0]);  // two largest value
        return ans;
    }
}