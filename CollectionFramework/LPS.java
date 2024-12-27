
public class LPS {

    static int lps(String s) {
        int n = s.length();

        int[] dp = new int[n];
        int[] dpPrev = new int[n];

        for (int i = n - 1; i >= 0; --i) {
            dp[i] = 1;

            for (int j = i + 1; j < n; ++j) {

                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = dpPrev[j - 1] + 2;
                } else {
                    dp[j] = Math.max(dpPrev[j], dp[j - 1]);
                }
            }
            dpPrev = dp.clone();
        }
        return dp[n - 1];

    }
    public static void main(String[] args) {
        String s = "anant";
        System.out.println("The length of the LPS is " + lps(s));
    }
}
