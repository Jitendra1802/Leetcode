class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum=Integer.MAX_VALUE;
        int n=nums.size();

        for(int i=0;i<nums.size();i++){
            int currSum=0;
            for(int j=i;j<n;j++){
                currSum+=nums.get(j);
                int len=j-i+1;

                if(len>=l && len<=r && currSum>0){
                    minSum=Math.min(currSum,minSum);
                }
            }
        }
        return minSum==Integer.MAX_VALUE ? -1:minSum;
    }
}