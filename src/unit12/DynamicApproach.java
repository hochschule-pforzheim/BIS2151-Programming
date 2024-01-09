package unit12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Example of a dynamic approach.
 *
 * @author Andreas Schneider
 */
public class DynamicApproach
{

    public static int maxNonIntersectingActivitiesDynamic(List<Activity> activities)
    {
        // Sort activities based on end time
        activities.sort(Comparator.comparingInt(a -> a.endTime));

        int n = activities.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (activities.get(j).endTime <= activities.get(i).startTime) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxResult = 0;
        for (int i : dp) {
            maxResult = Math.max(maxResult, i);
        }

        return maxResult;
    }

    public static void run()
    {
        // Example usage:
        // Create a list of activities and call the function
        List<Activity> activities = List.of(
                new Activity(1, 3),
                new Activity(2, 5),
                new Activity(3, 8),
                new Activity(5, 7),
                new Activity(8, 10)
        );

        int result = maxNonIntersectingActivitiesDynamic(activities);
        System.out.println("Maximum number of non-intersecting activities (Dynamic Programming): " + result);
    }
}
