public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "wildfire";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        shipFood = shipFood - (shipPopulation * 0.75);
        shipFood = shipFood - (shipPopulation * 0.75);
        System.out.println(shipFood);
        shipFood = shipFood + (shipFood * .5);

        shipPopulation = shipPopulation + 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Ocean";
        if (landingLocation == "The Plain") {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!! Flight plan already set. Landing on the plain");
        }

        landing = landingCheck(100);

        new GuessingGame();
    }

    public static boolean landingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            if (((i / 3) == 0) && (i / 5 == 0)) {
                System.out.println("Keep Center");
            } else if ((i / 5) == 0) {
                System.out.println("Right");
            } else if ((i / 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}

