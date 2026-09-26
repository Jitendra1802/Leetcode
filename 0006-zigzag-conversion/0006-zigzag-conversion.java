class Solution {

    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        boolean down = true;
        StringBuilder[] sbs = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            sbs[i] = new StringBuilder();
        }

        int index = 0, len = s.length(), i = 0;
        while(index < len){
            sbs[i].append(s.charAt(index));
            index++;

            if(down && i < numRows - 1){
                i++;
            } else if (down && i == numRows - 1){
                down = false;
                i--;
            } else if (!down && i > 0){
                i--;
            } else if (!down && i == 0){
                down = true;
                i++;
            }
        }

        for(int j = 1; j < numRows; j++){
            sbs[0].append(sbs[j]);
        }

        return sbs[0].toString();
    }
}