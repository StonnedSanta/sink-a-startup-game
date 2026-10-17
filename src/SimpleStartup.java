public class SimpleStartup {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public String checkYourself(int userGuess) {
        String result = "miss";
        for (int cell : locationCells) {
            if (cell == userGuess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}