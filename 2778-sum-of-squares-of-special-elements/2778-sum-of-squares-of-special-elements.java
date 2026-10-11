class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                sum+=nums[i]*nums[i];
                //System.out.println(sum);

            }
        }
        return (int)sum;
    }
}