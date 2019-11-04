package Run;

public class Run {
        int NumberOfRunners;
        String stadiumName;
        double weather;

    public Run(int numberOfRunners, String stadiumName, double weather) {
        NumberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.weather = weather;
    }

    public Run(int numberOfRunners, String stadiumName) {
        NumberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        weather=0;
    }
}

