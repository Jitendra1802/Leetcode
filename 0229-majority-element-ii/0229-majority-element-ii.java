class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp=new HashMap<>();

        int limit=nums.length/3;
        
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int key: mp.keySet()){
            if(mp.get(key)>limit){
                ans.add(key);
            }
        }
        return ans;
    }
}