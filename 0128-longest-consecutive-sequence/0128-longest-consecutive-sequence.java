class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        int count = 0;
        int longest = 1;
        int lastsmallest = Integer.MIN_VALUE;
        Arrays.sort(arr);

        if (arr.length == 0)
            return 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastsmallest) {
                count++;
                lastsmallest = arr[i];
            } else if (arr[i] != lastsmallest) {
                count = 1;
                lastsmallest = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}