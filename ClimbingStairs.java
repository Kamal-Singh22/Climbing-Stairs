public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        
        int first = 1;
        int second = 2;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }
}
