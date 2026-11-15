class Solution {
    public int numOfSubarrays(int[] arr) {
        int n= arr.length;
        int even=1;
        int odd=0;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum%2==0){
                count+=odd;
                even++;
            }else{
                count+=even;
                odd++;
            }
            count%=1000000007;
        }
        return count;
    }
}