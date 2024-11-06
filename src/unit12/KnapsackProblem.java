package unit12;

/**
 * This {@code KnapsackProblem} class provides a solution to the classic
 * knapsack problem using recursion. The goal is to maximise the value of items
 * placed into the knapsack without exceeding its weight capacity.
 *
 * <p>
 * The knapsack problem is a well-known problem in combinatorial optimisation,
 * where you have a set of items, each with a weight and a value, and you need
 * to determine the maximum value that can fit within a given weight
 * capacity.</p>
 *
 * @author Andreas R. Schneider
 */
public class KnapsackProblem
{

    /**
     * Solves the knapsack problem using a recursive approach.
     *
     * <p>
     * This method calculates the maximum value obtainable by including or
     * excluding each item within the knapsack's capacity constraints. It uses a
     * base case where the recursion stops if there are no items left or if the
     * knapsack capacity is zero.</p>
     *
     * @param value an array of integers representing the values of the items
     * @param weight an array of integers representing the weights of the items
     * @param n the index of the current item to be considered
     * @param knapcap the remaining capacity of the knapsack
     * @return the maximum value that can be achieved within the knapsack
     * capacity
     */
    public static int knapsack(int[] value, int[] weight, int n, int knapcap)
    {
        // base case: Negative capacity (invalid state)
        if (knapcap < 0)
        {
            return Integer.MIN_VALUE;
        }

        // base case: no items left or knapsack capacity is zero
        if (n < 0 || knapcap == 0)
        {
            return 0;
        }

        // Case 1: Include the current item and recur for remaining items with reduced capacity
        int include = value[n] + knapsack(value, weight, n - 1, knapcap - weight[n]);

        // Case 2: Exclude the current item and recur for the remaining items
        int exclude = knapsack(value, weight, n - 1, knapcap);

        // Return the maximum value obtained by including or excluding the current item
        return Integer.max(include, exclude);
    }

    /**
     * Demonstrates solving the knapsack problem by defining an example set of
     * values and weights, along with a knapsack capacity. It calls the
     * {@code knapsack} method to determine the maximum value achievable and
     * outputs the result.
     */
    public static void run()
    {
        // input: arrays representing the values and weights of the items
        int[] values =
        {
            20, 5, 10, 40, 15, 25
        };
        int[] weight =
        {
            1, 2, 3, 8, 7, 4
        };

        // knapsack capacity
        int cap = 10;

        System.out.println("Knapsack value is "
                + knapsack(values, weight, values.length - 1, cap));
    }
}
