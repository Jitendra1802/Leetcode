class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else{
                if(open>0){
                    open--;

                }else{
                    close++;
                }
            }
        }
        int max=Math.max(open,close);
        int ans=open+close;
        return ans;
    }
}