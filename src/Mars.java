public class Mars {
    public static void main(String[] args){
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
        if(landingLocation == "The Plain"){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!! Flight plan already set. Landing on the plain");
        }
    }

    landingCheck(){

    }
}