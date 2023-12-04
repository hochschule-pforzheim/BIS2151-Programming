package unit08;

/**
 * Example BuzzwordReport Class
 *
 * @author Andreas Schneider
 */
public class BuzzwordsReport extends Report
{

    void runReport()
    {
        // Call superclass Version, then come back and do some subclass specific stuff.
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

    void buzzwordCompliance()
    {
        System.out.println("Running buzzword Compliance.");
    }
}
