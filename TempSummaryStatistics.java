package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    final double avgTemp;
    final double devTemp;
    final double minTemp;
    final double maxTemp;

    TempSummaryStatistics(double avgTemp, double devTemp, double minTemp, double maxTemp) {
        this.avgTemp = avgTemp;
        this.devTemp = devTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

}
