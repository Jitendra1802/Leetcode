class Solution {
    List<Integer>[] adj;
    List<Integer>[] newTree;
    int[] newParent;
    int[] ans;
    Map<Character, Integer> map;
    public int[] findSubtreeSizes(int[] parent, String s) {

        int n = parent.length;

        adj = new ArrayList[n];
        newTree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            newTree[i] = new ArrayList<>();
        }

        // Build original tree
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }

        newParent = parent.clone();
        map = new HashMap<>();

        // Find new parents using original tree
        dfs(0, s);

        // Build modified tree
        for (int i = 1; i < n; i++) {
            newTree[newParent[i]].add(i);
        }

        // Calculate subtree sizes
        ans = new int[n];
        calculate(0);

        return ans;
    }

    void dfs(int node, String s) {

        char ch = s.charAt(node);

        // Save previous ancestor with same character
        Integer old = map.get(ch);

        // Update parent if matching ancestor exists
        if (old != null) {
            newParent[node] = old;
        }

        // Current node becomes nearest ancestor
        map.put(ch, node);

        // Traverse original children
        for (int child : adj[node]) {
            dfs(child, s);
        }

        // Restore previous value
        if (old == null) {
            map.remove(ch);
        } else {
            map.put(ch, old);
        }
    }

    int calculate(int node) {

        int size = 1;

        for (int child : newTree[node]) {
            size += calculate(child);
        }

        ans[node] = size;

        return size;
    }
}
