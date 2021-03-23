package attestation2;

/**
 * Sample solution of the weatherstation
 *
 * @author ainzone
 * @version 1.0
 */
public class Weatherstation
{

    private double temperature, windspeed, deltaTemp, deltaWind;

    private static final String NO_WARNING = "no warning";
    private static final String COLD_WARNING = "Cold Warning!";
    private static final String WIND_WARNING = "Wind Warning";
    private static final String STORM_WARNING = "Storm and Cold Warning!";

    public Weatherstation()
    {
        this.temperature = -10.0;
        this.windspeed = 0;
    }

    /**
     * Creates a console output that displays the actual weather, given by
     * temperature in Celsius, windspeed in km/h and a wind-chill temperature in
     * Celsius.
     *
     * @return
     */
    public String generateWeatherMessage()
    {
        double windChillTemp = calculateWindChillTemperature(measureTemperature(), measureWindspeed());
        String roundedTemperature = String.format("%.0f", this.temperature);
        String roundedWindspeed = String.format("%.0f", this.windspeed);
        String roundedWindChillTemp = String.format("%.0f", windChillTemp);
        String output = "Actual weather: Temp: "
                + roundedTemperature + "\u00B0" + "C" + " (Wind: "
                + roundedWindspeed + "km/h) ChillTemp: "
                + roundedWindChillTemp + "\u00B0" + "C, ";
        
        if (this.windspeed >= 70 && windChillTemp <= -18)
        {
            return output + STORM_WARNING;
        } 
        else if (this.windspeed >= 70.0)
        {
            return output + WIND_WARNING;
        } 
        else if (windChillTemp <= -18.0)
        {
            return output + COLD_WARNING;
        } 
        else
        {
            return output + NO_WARNING;
        }

    }

    /**
     * Checks the current temperature.
     *
     * @return Returns the corrected temperature.
     */
    private double measureTemperature()
    {
        this.temperature += deltaTemp;
        if (this.temperature == 30)
        {
            deltaTemp = -1;
        } 
        else if (this.temperature == -10)
        {
            deltaTemp = 5;
        }
        return this.temperature;
    }

    /**
     * Checks the current windspeed.
     *
     * @return Returns the corrected windspeed.
     */
    private double measureWindspeed()
    {
        this.windspeed += deltaWind;
        if (this.windspeed == 80)
        {
            deltaWind = -16;
        } 
        else if (this.windspeed == 0)
        {
            deltaWind = 8;
        }
        return this.windspeed;
    }

    /**
     * Calculates the windChillTemperature with two given parameters:
     * temperature and windspeed.
     *
     * @param temperature
     * @param windspeed
     * @return Returns the wind-chill-temperature
     */
    private double calculateWindChillTemperature(double temperature, double windspeed)
    {
        return (13.12 + 0.6215 * temperature) + ((0.3965 * temperature - 11.37) * Math.pow(windspeed, 0.16));
    }
}
