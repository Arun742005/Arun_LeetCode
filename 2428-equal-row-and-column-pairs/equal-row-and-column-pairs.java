class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

        // Store all rows in rowMap
        for (int i = 0; i < n; i++) {
            String key = Arrays.toString(grid[i]);
            rowMap.put(key, rowMap.getOrDefault(key, 0) + 1);
        }

        int count = 0;

        // For each column, convert to string and check in rowMap
        for (int col = 0; col < n; col++) {
            int[] columnArr = new int[n];

            for (int row = 0; row < n; row++) {
                columnArr[row] = grid[row][col];
            }

            String key = Arrays.toString(columnArr);

            if (rowMap.containsKey(key)) {
                count += rowMap.get(key);
            }
        }

        return count;
    }
}
