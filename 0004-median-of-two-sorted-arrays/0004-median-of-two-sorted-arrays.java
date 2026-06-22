class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge array
        int n= nums1.length;
        int m= nums2.length;
        int[] res=new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i++];
            }else{
                res[k++]=nums2[j++];
            }
        }
        while(i<n){
            res[k++]=nums1[i++];
        }
        while(j<m){
            res[k++]=nums2[j++];
        }
        int len=n+m;
        if(len%2==1){
            return res[len/2];
        }else
            return (res[len/2-1]+res[len/2])/2.0;
    }
}