class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int max=nums[0];
        int small=nums[0];
        for(int num : nums){
            small=Math.min(num,small);
            max=Math.max(num, max);
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int i=small;i<max;i++){
            if(map.containsKey(i)){
                continue;
            }else{
                ans.add(i);
            }
        }
        return ans;
    }
}