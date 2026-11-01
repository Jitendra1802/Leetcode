class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        //Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            min=Math.min(nums[i],min);
        }
        for(int i=0;i<n;i++){
            count+=nums[i]-min;
        }
        return count;
    }
}