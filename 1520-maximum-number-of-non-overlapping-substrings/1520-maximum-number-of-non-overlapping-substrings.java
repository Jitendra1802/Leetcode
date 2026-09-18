class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n=s.length();

        int[] start= new int[26];
        int[] end=new int[26];

        Arrays.fill(start,-1);

        // Find first and last occurance
        for(int i=0;i<n;i++){
            int idx=s.charAt(i)-'a';
            if(start[idx]==-1){
                start[idx]=i;
            }
            end[idx]=i;
        }

        List<int[]> intervals=new ArrayList<>();

        for(int c=0;c<26;c++){
            if(start[c]==-1){
                continue;
            }
            int l=start[c];
            int r=end[c];
            boolean valid=true;

            for(int i=l;i<=r;i++){
                int idx=s.charAt(i)-'a';

                if(start[idx]<l){
                    valid=false;
                    break;
                }
                r=Math.max(r,end[idx]);
            }
            if(valid){
                intervals.add(new int[]{l,r});
            }
        }

        intervals.sort((a,b)->a[1]-b[1]);
        List<String> ans= new ArrayList<>();

        int prevEnd=-1;

        for(int[] interval : intervals){
            int l=interval[0];
            int r=interval[1];
            if(l>prevEnd){
                ans.add(s.substring(l,r+1));
                prevEnd=r;
            }
        }
        return ans;
    }
}