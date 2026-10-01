class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                int top=st.pop();
                if((ch==')' && top!='(') ||
                    (ch=='}' && top!='{') ||
                    (ch==']' && top!='[')){
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
}