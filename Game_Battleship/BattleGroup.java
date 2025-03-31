public class BattleGroup {
    private String name;
    private StarShip ship1, ship2, ship3;
    private int speed, firePower;
    private static int numOfBattleGroups = 0;

    public BattleGroup(StarShip ship1, StarShip ship2, StarShip ship3) {
        numOfBattleGroups++; // Increment group count
        this.ship1 = ship1;
        this.ship2 = ship2;
        this.ship3 = ship3;

        // Generate name safely
        name = "(Group-" + numOfBattleGroups + "): " +
               safeSubstring(ship1.getName()) + ", " +
               safeSubstring(ship2.getName()) + ", " +
               safeSubstring(ship3.getName());

        // Calculate average speed and total firepower
        speed = (ship1.getSpeed() + ship2.getSpeed() + ship3.getSpeed()) / 3;
        firePower = ship1.getFirePower() + ship2.getFirePower() + ship3.getFirePower();
    }

    // Safe substring method to avoid errors
    private String safeSubstring(String str) {
        return str.length() >= 3 ? str.substring(0, 3) : str;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFirePower() {  // Added missing method
        return firePower;
    }

    public void printGroupDetails() {
        System.out.println("The name of the BattleGroup is: " + getName());
        System.out.println("Its speed is: " + getSpeed());
        System.out.println("Its firepower is: " + getFirePower());
        System.out.println("And it has the following Starships:\n");

        ship1.printShipDetails();
        ship2.printShipDetails();
        ship3.printShipDetails();

        System.out.println("______________________________________________________________________________________________________________________\n");
    }
}
