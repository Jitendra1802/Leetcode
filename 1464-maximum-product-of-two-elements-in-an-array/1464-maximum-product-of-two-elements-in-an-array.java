class Solution {
    public int maxProduct(int[] nums) {
        // int max1=0;
        // int max2=0;
        // int n=nums.length;
    
        // Arrays.sort(nums);
        // max1=nums[n-1];
        // max2=nums[n-2];
        // return ((max1-1)*(max2-1));

        int first=0;
        int second=0;
        for(int num : nums){
            if(num>=first){
                second=first;
                first=num;
            }else if(num>second){
                second=num;
            }
        }
        return (first-1)*(second-1);
        
        
    }
}