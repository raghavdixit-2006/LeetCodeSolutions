class Solution {
    public int[] plusOne(int[] arr) {
        int i = arr.length - 1;

        while (i >= 0) {
            if (arr[i] == 9) {
                arr[i] = 0;
                i--;
            } else {
                arr[i]++;
                return arr;
            }
        }

        // If all digits were 9, e.g. [9,9,9] -> [1,0,0,0]
        int[] result = new int[arr.length + 1];
        result[0] = 1;

        return result;
    }
}