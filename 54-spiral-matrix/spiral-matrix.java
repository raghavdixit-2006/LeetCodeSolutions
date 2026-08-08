class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int top = 0;
        int bottom = m.length - 1;
        int left = 0;
        int right = m[0].length - 1;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                list.add(m[top][i]);
            top++;

            for (int j = top; j <= bottom; j++)
                list.add(m[j][right]);
            right--;
            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    list.add(m[bottom][k]);
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    list.add(m[l][left]);
                left++;
            }
        }
        
        return list;
    }
}