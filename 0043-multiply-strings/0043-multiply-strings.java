class Solution {
    public String multiply(String num1, String num2) {
        // int a=Integer.parseInt(num1);
        // int b=Integer.parseInt(num2);
        // int ans=a*b;
        // return String.valueOf(ans);

        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int n=num1.length();
        int m=num2.length();

        int[] ans= new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int a=num1.charAt(i)-'0';
                int b=num2.charAt(j)-'0';
                int product=a*b;

                int p1=i+j;
                int p2=i+j+1;

                int sum=product+ans[p2];
                ans[p2]=sum%10;
                ans[p1]+=sum/10;


            }
        }
        StringBuilder sb=new StringBuilder();
        for(int digit : ans){
            if(sb.length()==0 && digit==0){
                continue;
            }
            sb.append(digit);
        }
        return sb.toString();
    }
}