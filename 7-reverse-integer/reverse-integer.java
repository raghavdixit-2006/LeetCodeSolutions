class Solution {
    public int reverse(int x) {
        int ans = 0;
         if(x==Integer.MIN_VALUE) return 0;

        if (x > 0) {
            while (x != 0) {
                int digit = x % 10;

                if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return 0;
                }

                ans = ans * 10 + digit;
                x /= 10;
            }
        }

        if (x < 0) {
            x = Math.abs(x);

            while (x != 0) {
                int digit = x % 10;

                if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return 0;
                }

                ans = ans * 10 + digit;
                x /= 10;
            }

            ans *= -1;
        }

        return ans;
    }
}