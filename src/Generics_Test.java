public class Generics_Test {

    public static void main(String[] args) {


        Triple<String, Integer, Integer>[] aoTriple = new Triple[5];


        aoTriple[0] = new Triple<>("Connor McGregor", 21, 4);
        aoTriple[1] = new Triple<>("Khabib Nurmagomedov", 27, 0);
        aoTriple[2] = new Triple<>("Tony Ferguson", 24, 3);
        aoTriple[3] = new Triple<>("Derrick Lewis", 21, 5);
        aoTriple[4] = new Triple<>("Alexander Volkov", 30, 7);

        Pair<String, Double>[] aoPair = new Pair[5];

        for (int x = 0; x < aoTriple.length; x++) {

            String sTeam = aoTriple[x].getTeam();
            double iWins = aoTriple[x].getWins();
            double iLosses = aoTriple[x].getLoses();
            Double dStats = (iWins / (iWins + iLosses)) * 100;
            aoPair[x] = new Pair<>(sTeam, dStats);
        }

        for (int x = 0; x < aoPair.length; x++) {
            System.out.printf("%s's victory rate is %.2f%%\n", aoPair[x].getTeam(), aoPair[x].getStats());
        }

        double maxValue = aoPair[0].getStats();
        for (int x = 1; x < aoPair.length; x++) {
            if (aoPair[x].getStats() > maxValue) {
                maxValue = aoPair[x].getStats();
            }
        }
        System.out.println("\nThe highest victory rate is: " + maxValue + "%");
    }
}