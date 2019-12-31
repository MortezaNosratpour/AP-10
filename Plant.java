public class Plant {
    public int turn;/// this should move to main
    String[][] garden = new String[6][19];



    private String name;
    public String getName() {
        return name;
    }
    private int insertionTurn;// the turn wich we plant the flower
    private int health;
    public int getHealth() {
        return health;
    }
    private int hurtingDegree;//indicate how much is hurt zombies
    private int location_x;
    public int getLocation_x() {
        return location_x;
    }
    private int location_y;
    public int getLocation_y() {
        return location_y;
    }


    private int price;
    private int restTime;
    private int shootPeriod;
    private int periodCounter; //its the const. NO. that indicate when should plant shoots.
    private int numOfShoots;
    // should has the arraylist of bullets


    public Plant(String name, int insertionTurn){
        this.name = name;
        this.insertionTurn = insertionTurn;
        setProperties(name);
    }
    private void setProperties(String name){
        if (name.equals("PeaShooter")){

        }
        else if (name.equals("SnowPea")){

        }
        else if (name.equals("Cabbage_Plut")){

        }
        else if (name.equals("Repeater")){

        }
        else if (name.equals("Threepeater")){

        }
        else if (name.equals("Cactus")){

        }
        else if (name.equals("GatlingPea")){

        }
        else if (name.equals("Scaredy_Shroom")){

        }
        else if (name.equals("KernelPlut")){

        }
        else if (name.equals("SplitPea")){

        }
        else if (name.equals("Explode_O_Nut")){

        }
        else if (name.equals("Melon_Plut")){

        }
        else if (name.equals("LilyPad")){

        }
        else if (name.equals("Winter_Melon")){

        }
        else if (name.equals("Wall_Nut")){

        }
        else if (name.equals("TangleKelp")){

        }
        else if (name.equals("Tall_Nut")){

        }
        else if (name.equals("Cattail")){

        }
        else if (name.equals("PotatoMine")){

        }
        else if (name.equals("CherryBomb")){

        }
        else if (name.equals("Magnet_Shroom")){

        }
        else if (name.equals("Sunflower")){

        }
        else if (name.equals("TwinSunflower")){

        }
        else if (name.equals("Jalapeno")){

        }


    }
    public void activity(String name){
        if (name.equals("PeaShooter")){

        }
        else if (name.equals("SnowPea")){

        }
        else if (name.equals("Cabbage_Plut")){

        }
        else if (name.equals("Repeater")){

        }
        else if (name.equals("Threepeater")){

        }
        else if (name.equals("Cactus")){

        }
        else if (name.equals("GatlingPea")){

        }
        else if (name.equals("Scaredy_Shroom")){

        }
        else if (name.equals("KernelPlut")){

        }
        else if (name.equals("SplitPea")){

        }
        else if (name.equals("Explode_O_Nut")){

        }
        else if (name.equals("Melon_Plut")){

        }
        else if (name.equals("LilyPad")){

        }
        else if (name.equals("Winter_Melon")){

        }
        else if (name.equals("Wall_Nut")){

        }
        else if (name.equals("TangleKelp")){

        }
        else if (name.equals("Tall_Nut")){

        }
        else if (name.equals("Cattail")){

        }
        else if (name.equals("PotatoMine")) {
            if (turn - insertionTurn == 1) {
                //do nothing
            } else {
                if (garden[location_x + 1][location_y].contains("Zombie") || garden[location_x][location_y + 1].contains("Zombie") || garden[location_x - 1][location_y].contains("Zombie") || garden[location_x][location_y - 1].contains("Zombie") || garden[location_x + 1][location_y - 1].contains("Zombie") || garden[location_x + 1][location_y + 1].contains("Zombie") || garden[location_x - 1][location_y + 1].contains("Zombie") || garden[location_x - 1][location_y - 1].contains("Zombie")) {
                    garden[location_x + 1][location_y] = "none";
                    garden[location_x][location_y + 1] = "none";
                    garden[location_x - 1][location_y] = "none";
                    garden[location_x][location_y - 1] = "none";
                    garden[location_x + 1][location_y - 1] = "none";
                    garden[location_x + 1][location_y + 1] = "none";
                    garden[location_x - 1][location_y + 1] = "none";
                    garden[location_x - 1][location_y - 1] = "none";
                }
            }
        }
        else if (name.equals("CherryBomb")){

        }
        else if (name.equals("Magnet_Shroom")){

        }
        else if (name.equals("Sunflower")){
            if (turn - insertionTurn % 2 == 0){
                //generate a sun
            }
        }
        else if (name.equals("TwinSunflower")){
            if (turn - insertionTurn % 2 == 0){
                // generate two suns
            }
        }
        else if (name.equals("Jalapeno")){

        }

    }



}
