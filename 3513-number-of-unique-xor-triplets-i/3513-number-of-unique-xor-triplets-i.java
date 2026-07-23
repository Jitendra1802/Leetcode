class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int p=1;
        while(p<=n){
            p<<=1;
        }
        return p;
    }
}