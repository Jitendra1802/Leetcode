class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;

        int Min=Integer.MAX_VALUE;

        for(int j : nums1){
            Min=Math.min(Min,j);
        }
        boolean evens=true;
        for(int num : nums1){
            if(num%2!=0){
                if(Min%2!=0){
                    continue;
                }else{
                    evens=false;
                    break;
                }
            }
        }
        boolean odd=true;
        for(int num : nums1){
            if(num%2==0){
                if(Min%2!=0 && num>Min){
                    continue;
                }else if(num==Min){
                    odd=false;
                    break;
                }else{
                    odd=false;
                    break;
                }
            }
        }
        return evens || odd;
    }
}