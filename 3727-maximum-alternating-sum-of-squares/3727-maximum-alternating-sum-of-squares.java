class Solution {
    public long maxAlternatingSum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0 - nums[i];
            }
            System.out.println(nums[i]);
        }

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        long sum = 0;
        while (i < j) {
            
             
                sum += (long) (nums[j] * nums[j] - nums[i] * nums[i]);
            

            i++;
            j--;

        }

        if(nums.length%2!=0){
            sum+=(long)(nums[nums.length/2]* nums[nums.length/2]);
        }

        return sum;
    }
}