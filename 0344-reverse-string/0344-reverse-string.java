class Solution {
    public void reverseString(char[] s) {
        String str= new String(s);
        String sb= new StringBuilder(str).reverse().toString();


        for(int i=0;i<s.length;i++){
            s[i]=sb.charAt(i);
        }
    }
}