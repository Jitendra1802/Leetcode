class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;
        int max2=0;
        int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     max1=Math.max(max1,nums[i]);
        // }
        Arrays.sort(nums);
        max1=nums[n-1];
        max2=nums[n-2];
        return ((max1-1)*(max2-1));
        
        
    }
}