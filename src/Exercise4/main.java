package Exercise4;

public class main {
    public static void main(String[] args) {
        //One birth happens every 7 seconds
        //One death happens every 13 seconds
        //The population of the USA is currently: 331,002,651.
        //Write a program that calculates how the US population are projected to be in 5 years.
        //Print the growth & sum

        double populationCurrent = 331002651;
        double populationInFiveYears = 0;
        double fiveYearsInSeconds = 157680000;
        for (int i = 0; i < fiveYearsInSeconds; i++) {
            if (i % 7 == 0) {
                populationInFiveYears++;
            }
            if (i % 13 == 0) {
                populationInFiveYears--;
            }
        }
        populationInFiveYears = populationInFiveYears + populationCurrent;
        double growthRate = (populationInFiveYears - populationCurrent) / populationCurrent * 100;


        System.out.println("The current population in US is " + (long)populationCurrent);
        System.out.println();
        System.out.println("The population in five years is " + (long)populationInFiveYears);
        System.out.println();
        System.out.println("That is a " + (long)growthRate + "% growth");


    }
}
