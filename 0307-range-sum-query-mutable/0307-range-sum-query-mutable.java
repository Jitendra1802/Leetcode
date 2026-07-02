class NumArray {
    int[] tree;
    int[] nums;
    int n;

    public NumArray(int[] nums) {
        this.n = nums.length;
        this.nums = nums.clone();
        tree = new int[4 * n];
        build(nums, 0, 0, n - 1);
    }

    // Build Segment Tree
    public void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
        } else {
            int mid = (start + end) / 2;
            build(nums, 2 * node + 1, start, mid);
            build(nums, 2 * node + 2, mid + 1, end);
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    // Update wrapper
    public void update(int index, int val) {
        update(0, 0, n - 1, index, val);
    }

    // Update function
    public void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = val;
        } else {
            int mid = (start + end) / 2;
            if (idx <= mid) {
                update(2 * node + 1, start, mid, idx, val);
            } else {
                update(2 * node + 2, mid + 1, end, idx, val);
            }
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    // Query wrapper
    public int sumRange(int left, int right) {
        return sumRange(0, 0, n - 1, left, right);
    }

    // Query function
    public int sumRange(int node, int start, int end, int left, int right) {
        if (right < start || end < left) {
            return 0;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;
        int l = sumRange(2 * node + 1, start, mid, left, right);
        int r = sumRange(2 * node + 2, mid + 1, end, left, right);
        return l + r;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */