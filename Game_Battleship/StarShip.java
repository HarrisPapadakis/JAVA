public class StarShip {
    // Instance variables to store ship attributes
    private String name;
    private int speed, firePower;

    // Constructor to initialize the StarShip with name, speed, and firepower
    public StarShip(String name, int speed, int firePower) {
        this.name = name;
        this.speed = speed;
        this.firePower = firePower;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for speed
    public int getSpeed() {
        return speed;
    }

    // Getter method for firepower
    public int getFirePower() { // Corrected capitalization (firepower → firePower)
        return firePower;
    }

    // Method to print ship details
    public void printShipDetails() {
        System.out.println("The name of the StarShip is: " + getName() + 
                           ",\nIts speed is: " + getSpeed() + 
                           ",\nIts firepower is: " + getFirePower() + ".");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a StarShip object
        StarShip enterprise = new StarShip("Enterprise", 5000, 200);
        
        // Printing details of the StarShip
        enterprise.printShipDetails();
    }
}
