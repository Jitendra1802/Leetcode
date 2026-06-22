class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res= 0;
        int left=0;
        int right=0;
        char[] arr= s.toCharArray();
        Map<Character, Integer> mp= new HashMap<>();
        for(right=0;right<arr.length;right++){
            int idx=mp.getOrDefault(arr[right],-1);
            if(idx!=-1 && idx>=left){
                res=Math.max(res,right-1-left+1);
                left=idx+1;
            }
            mp.put(arr[right], right);
        }     
        return Math.max(res,right-1-left+1);   
    }
}