package unit12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Example code for a greedy approach
 *
 * @author Andreas Schneider
 */
public class GreedyApproach
{

    public static int maxNonIntersectingActivitiesGreedy(List<Activity> activities)
    {
        // Sort activities based on end time
        Collections.sort(activities, Comparator.comparingInt(a -> a.endTime));

        int currentEndTime = Integer.MIN_VALUE;
        int result = 0;

        for (Activity activity : activities) {
            if (currentEndTime < activity.startTime) {
                result++;
                currentEndTime = activity.endTime;
            }
        }

        return result;
    }

    public static void run(String[] args)
    {
        // Example usage: Create a list of activities and call the function
        List<Activity> activities = List.of(
                new Activity(1, 3),
                new Activity(2, 5),
                new Activity(3, 8),
                new Activity(5, 7),
                new Activity(8, 10)
        );

        int result = maxNonIntersectingActivitiesGreedy(activities);
        System.out.println("Maximum number of non-intersecting activities: " + result);
    }
}
