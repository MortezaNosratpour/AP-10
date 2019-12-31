
public class Zombie {
	String[][] garden = new String[6][19];
	public int turn;// it should be defined in main
	private String name;
	public String getName() {
		return name;
	}
	private int insertionTurn;
	private int health;
	public int getHealth() {
		return health;
	}
	private int location_x;
	private int location_y;
	private int price;
	private int speed;
	private int power;
	// if the zombie has armor the hasArmor is true and if not it is false
	private boolean hasArmor;
	// if the zombie has bucketHead this variable is true and if not it is false
	private boolean hasBucketHead;
	// if the zombie is Zomboni hasMachine & isStrong will be true
	// if the zombie is Captual Zombie hasMachine & isWeak will be true
	private boolean hasMachine;
	private boolean isStrong;
	private boolean isWeak;
	// if the zombie is Bungee Zombie
	private boolean isBungee;
	private boolean hasBallon;
	
	
	
	public Zombie (String name , int insertoinTurn) {
		this.insertionTurn = insertoinTurn;
		this.name = name;
		
	}
	
	public static void walk() {
		
	}
	public void activity (String name) {
		
		if (name.equals("Zombie")) {
			
			
		}
		else if (name.equals("FootballZombie")) {
			
		}
		else if (name.equals("BucketheadZombie")) {
			
		}
		else if (name.equals("ConeheadZombie")) {
			
		}
		else if (name.equals("Zomboni)")) {
			
		}
		else if (name.equals("CatapultZombie")) {
			
		}
		else if (name.equals("BungeeZombie")) {
			
		}
		else if (name.equals("BalloonZombie")) {
			
		}
		else if (name.equals("NewspaperZombie")) {
			
		}
		else if (name.equals("TargetZombie")) {
			
		}
		else if (name.equals("ScreenDoorZombie")) {
			
		}
		else if (name.equals("Giga-gargantuarZombie")) {
			
		}
		else if (name.equals("PogoZombie")) {
			
		}
		else if (name.equals("SnorkelZombie")) {
			
		}
		else if (name.equals("DolphinRiderZombie")) {
			
		}
	}


	private void setProperties(String name) {
		if (name.equals("Zombie")) {
			
		}
		else if (name.equals("FootballZombie")) {
			
		}
		else if (name.equals("BucketheadZombie")) {
			
		}
		else if (name.equals("ConeheadZombie")) {
			
		}
		else if (name.equals("Zomboni)")) {
			
		}
		else if (name.equals("CatapultZombie")) {
			
		}
		else if (name.equals("BungeeZombie")) {
			
		}
		else if (name.equals("BalloonZombie")) {
			
		}
		else if (name.equals("NewspaperZombie")) {
			
		}
		else if (name.equals("TargetZombie")) {
			
		}
		else if (name.equals("ScreenDoorZombie")) {
			
		}
		else if (name.equals("Giga-gargantuar")) {
			
		}
		else if (name.equals("PogoZombie")) {
			
		}
		else if (name.equals("SnorkelZombie")) {
			
		}
		else if (name.equals("DolphinRiderZombie")) {
			
		}
		
		
	}
	
	
}
