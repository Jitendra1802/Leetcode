class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n =s.length();
        // activeCount 1
        int activeCount=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                activeCount+=1;
            }
        }
        ArrayList<Integer> inactiveBlocks=new ArrayList<>();
        int i=0;
        while(i<n){
            if(s.charAt(i)=='0'){
                int start=i;
                while(i<n && s.charAt(i)=='0'){
                    i++;
                }
                inactiveBlocks.add(i-start);
            }else{
                i++;
            }
        }
        int maxPairsum=0;

        for(int j=1; j<inactiveBlocks.size();j++){
            maxPairsum=Math.max(maxPairsum, inactiveBlocks.get(j)+inactiveBlocks.get(j-1));
        }
        return maxPairsum+activeCount;


        
    }
}