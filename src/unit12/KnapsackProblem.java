package unit12;

/**
 * Example solution to a Knapsack Problem
 *
 * @author Andreas Schneider
 */
public class KnapsackProblem
{

    // Values (stored in array `value`)
    // Weights (stored in array `weight`)
    // Total number of distinct items `n`
    // Knapsack capacity `knapcap`
    public static int knapsack(int[] value, int[] weight, int n, int knapcap)
    {
        // base case: Negative capacity
        if (knapcap < 0) {
            return Integer.MIN_VALUE;
        }

        // base case: no items left or capacity becomes 0
        if (n < 0 || knapcap == 0) {
            return 0;
        }

        // Case 1. Include current item `value[n]` in the knapsack and recur for
        // remaining items `n-1` with decreased capacity `knapcap-weight[n]`
        int include = value[n] + knapsack(value, weight, n - 1, knapcap - weight[n]);

        // Case 2. Exclude current item `value[n]` from the knapsack and recur for
        // remaining items `n-1`
        int exclude = knapsack(value, weight, n - 1, knapcap);

        // return maximum value we get by including or excluding the current item
        return Integer.max(include, exclude);
    }

    public static void run()
    {
        // input: a set of items, each with a weight and a value
        int[] values = {20, 5, 10, 40, 15, 25};
        int[] weight = {1, 2, 3, 8, 7, 4};

        // knapsack capacity
        int cap = 10;

        System.out.println("Knapsack value is "
                + knapsack(values, weight, values.length - 1, cap));
    }
}
