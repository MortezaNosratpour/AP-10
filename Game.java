import java.util.ArrayList;
public class Game {

    public static void main(String[] args) {
        /**
         * @the turn of the game is calculated with "turn"
         */
         // the row and column of garden
        int gardenRow = 6;
        int gardenColumn = 22;// the 20'th and 21st column is for putting zombies
        int turn = 0;
        // the garden is this object
        Garden garden = new Garden(gardenRow, gardenColumn);
        // the existing elements of the game are gather here
        ArrayList<Plant> plants = new ArrayList<Plant>();
        ArrayList<Zombie> zombies = new ArrayList<Zombie>();
        //ArrayList<Bullet> bullets = new ArrayList<Bullet>();
        //ArrayList<LawnMover> lawnMovers = new ArrayList<LawnMover>();
        // the commands will scan with this object
        CommandScanner scanner = new CommandScanner();
        // the results will print with this object
        Console console = new Console();
        // the game handler will start with getting a command
        scanner.scanCommands();
        // object game will execute the commands
        Handler handler = new Handler("Day");
        // the collection of 7 cards that player has during the game


        /**
         * @ the game will start in this while with first command
         */

        boolean gameIsContinued = true; // when we want end game this parameter will set "false"
        while(gameIsContinued){
            while (!scanner.getCommand().equals("End turn")){
                // execute the given commands with object game
                handler.execute(scanner.getCommand(), plants, garden, zombies);



                // update the garden with this method of object game
                handler.updateGarden(garden);
                // this method will print the garden after updating it
                printGarden(garden.getGarden(), gardenRow, gardenColumn);
                turn += 1;
                scanner.scanCommands();

            }
            // update the garden with this method of object game
            handler.updateGarden(garden);
            scanner.scanCommands();
            if (scanner.getCommand().equals("end")){
                System.out.println("the game is end");
                gameIsContinued = false;
            }

        }

    }
    public static void printGarden(String[][] garden, int row, int column){
        for (int rowCounter = 0 ; rowCounter < row ; rowCounter++){
            for (int columnCounter = 0 ; columnCounter < column ; columnCounter++ ){
                System.out.print(garden[rowCounter][columnCounter] + " ");
            }
            System.out.println("");
        }

    }
}
