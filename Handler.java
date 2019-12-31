import java.util.ArrayList;
public class Handler {
    /**
     * @ this class will execute the commands and communicate with other class
     */

    /**
     * this method will execute commands in the "turn"
     * @param command
     */
    ArrayList<Plant> plants;
    ArrayList<Cards> reachedPlantCards = new ArrayList<Cards>();
    ArrayList<Cards> selectedPlantCards = new ArrayList<Cards>();

    ArrayList<Cards> reachedZombieCards = new ArrayList<Cards>();
    ArrayList<Cards> selectedZombieCards = new ArrayList<Cards>();
    Cards currentCard = new Cards(); // THIS IS THE CARD WHICH PLAYER SELECT TO PLANT IN GARDEN
    String name; // the name of gametype
    public Handler(String name){
        this.name = name;


    }

    public void execute(String command, ArrayList<Plant> plants, Garden garden, ArrayList<Zombie> zombies){
        String[] splitedCommand = new String[10];
        splitedCommand = command.split(" ");
        ArrayList<Cards> reachedCards = new ArrayList<Cards>(); // this arraylist is for the all cards that player has
        ArrayList<Cards> selectedCards = new ArrayList<Cards>();// this arraylist is for the all 7 selected cards that player has

        // if the command is "select", then :
        if (splitedCommand[0].equals("Collection") && splitedCommand[1].equals("(Plants)")){
            setCollectionPlants(selectedPlantCards , reachedPlantCards);
        }
        else if (command.equals("Show hand")){
            getSelectedCard(selectedPlantCards);
        }
        else if (splitedCommand[0].equals("Select") && !this.name.equals("Rail")){
            for (int counter = 0 ; counter < selectedPlantCards.size() ; counter++){
                if (splitedCommand[1].equals(selectedPlantCards.get(counter).getName())){
                    // implement a method to check out the price and rest time of plants against the sunsvalue

                       currentCard = selectedPlantCards.get(counter);


                }
            }
        }
        else if (splitedCommand[0].equals("Plant")){
            int row = Integer.parseInt(splitedCommand[1]);
            int column = Integer.parseInt(splitedCommand[2]);
            planting(row, column, garden);
        }
        else if (splitedCommand[0].equals("Remove")){
            int row = Integer.parseInt(splitedCommand[1]);
            int column = Integer.parseInt(splitedCommand[2]);
            remove(row, column, plants, garden);
        }
        else if(command.equals("Show lawn")){
            System.out.println("EXISTED PLANTS");
            System.out.println("NO." + "        " + "PLANT NAME" + "        " + "HEALTH");
            for (int counter = 0 ; counter < plants.size() ; counter++){
                System.out.println(counter + 1 + "      " + plants.get(counter).getName() + "       " + plants.get(counter).getHealth());
            }
            System.out.println("EXISTED ZOMBIES");
            System.out.println("NO." + "        " + "ZOMBIE NAME" + "        " + "HEALTH");
            for (int counter = 0 ; counter < plants.size() ; counter++){
                System.out.println((counter + 1) + "      " + zombies.get(counter).getName() + "       " + zombies.get(counter).getHealth());
            }
        }
        if (this.name.equals("Day")){
            if (selectedPlantCards.size() < 8){
                System.out.println("select a card :");
            //    setCollection("Day", currentCard.getName());
                setCollectionPlants(selectedPlantCards , reachedPlantCards);
            }



        }
        else if (this.name.equals("Water")){

        }
        else if (this.name.equals("Rail")){
            ArrayList<Cards> railCards = new ArrayList<Cards>();
            if (command.equals("List")){
                for (int counter = 0 ; counter < railCards.size() ; counter++){
                    System.out.print(railCards.get(counter).getName() + " */*/* ");
                }
            }
            else if(splitedCommand[0].equals("Select")){
                currentCard = railCards.get(Integer.parseInt(splitedCommand[1]));
                railCards.remove(Integer.parseInt(splitedCommand[1]));
            }
            else if(command.equals("Record")){
                System.out.println("No.of killed Zombies : ");
                // should "sout" the num of kiiled zombies
            }
        }
        else if (this.name.equals("Zombie")){
            if (splitedCommand[0].equals("Put")){
                int rowNo = Integer.parseInt(splitedCommand[3]);
                /// check the money and row
                boolean moneyIsEnough = false;
                int zombieCounterOnRow = 0;
                boolean twoZombieIsOnRow = false; // this boolean used for checking that two zombie is on row or not
                for (int counter = 0 ; counter < garden.getGarden()[rowNo].length ; counter++){
                    if (garden.getGarden()[rowNo][counter].contains("Zomb")){
                        zombieCounterOnRow += 1;
                    }
                    if (zombieCounterOnRow == 2){
                        twoZombieIsOnRow = true;
                        break;
                    }
                }
                if (twoZombieIsOnRow){
                    System.out.println("there is two zombie in this row :(");
                }
                if (!twoZombieIsOnRow && moneyIsEnough){
                    if (garden.getGarden()[rowNo][20].equals("mt")){
                        planting(rowNo, 20, garden);
                    }
                    else if (garden.getGarden()[rowNo][21].equals("mt")){
                        planting(rowNo, 21, garden);
                    }
                    else{
                        System.out.println("can not put :(");
                    }

                }
            }
        }
        else if (this.name.equals("PvP")){

        }
    }

    // the common commands betweengame :
    boolean locationIsFilled(Garden garden, int row, int column){
        if(garden.getGarden()[row][column] != "mt"){
            return true;
        }
        return false;
    }
    void setCollectionPlants(ArrayList<Cards> selectedPlantCards, ArrayList<Cards> reachedPlantCards){
        while (selectedPlantCards.size() < 8){

            boolean cardIsSelected = false;
            for (int counter = 0 ; counter < reachedPlantCards.size() ; counter++){
                System.out.print(reachedPlantCards.get(counter).getName() + "   ***    ");
            }
            System.out.println("");
            for (int counter = 0 ; counter < reachedPlantCards.size()  ; counter++){
                if(cardName == reachedPlantCards.get(counter).getName()){
                    for (int counter1 = 0 ; counter1 < selectedPlantCards.size() ; counter1++){
                        if (cardName == selectedPlantCards.get(counter).getName()){
                            System.out.println("this card has been selected!!! select an other one");
                            cardIsSelected = true;
                        }
                    }
                    if (!cardIsSelected){
                        selectedPlantCards.add(reachedPlantCards.get(counter));
                        break;
                    }

                }
            }
        }
    }
    void getSelectedCard(ArrayList<Cards>cards){
        for (int counter = 0 ; counter < cards.size() ; counter++){
            System.out.println("Card name :  " + cards.get(counter).getName() + " needed suns :  " +  cards.get(counter).getPrice() + " rest time :  " + cards.get(counter).getRestTime());
        }
    }
    void plant(int row, int column){

    }
    public void remove(int row, int column, ArrayList<Plant> plants, Garden garden){
      for (int counter = 0 ; counter < plants.size() ; counter++){
          if (row == plants.get(counter).getLocation_x() && column == plants.get(counter).getLocation_y()){
              plants.remove(counter);
              garden.getGarden()[row][column] = "mt";
              break;
          }
      }
    }
    public void planting(int row, int column, Garden garden){

        boolean cardIsNULL = false;
        boolean locationIsFilled = false;
        if (currentCard == null){
            cardIsNULL = true;
        }
        if (locationIsFilled(garden, row, column)){
            locationIsFilled = true;
        }
        if (cardIsNULL == true){
            System.out.println("YOU DID NOT SELECT ANY CARD :(");
        }
        if (locationIsFilled == true){
            System.out.println("location Is Filled :( ");
        }

    }
    void showLawn(){

    }
    public void endTurn(){
        //it should break the game "while"
    }

    /**
     * this method will update garden after the "turn" is over
     * @param garden
     */
    public void updateGarden(Garden garden){

    }
}
