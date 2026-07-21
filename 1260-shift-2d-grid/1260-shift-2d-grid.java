class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid[0].length;
        int m=grid.length;

        int[] arr= new int[m*n];
        int z=arr.length;
        k%=z;
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[idx++]=grid[i][j];
            }
        }
        reverse(arr,0,z-1);
        reverse(arr,0,k-1);
        reverse(arr,k,z-1);

        List<List<Integer>> ans = new ArrayList<>();

        idx = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(arr[idx++]);
            }
            ans.add(row);
        }

        return ans;


    }
    private void reverse(int[] nums, int left, int right) {

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}