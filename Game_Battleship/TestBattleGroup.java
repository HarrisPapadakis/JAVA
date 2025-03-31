import java.io.IOException;

public class TestBattleGroup
{
    // instance variables
    private String name;
    private int speed, firePower;
    
    public static void main(String args[])
    {
        BattleGroup group1, group2;
        
        StarShip ship1, ship2, ship3, ship4, ship5, ship6;
        
        ship1 = new StarShip("Zeus", 100, 1000);
        ship2 = new StarShip("Athena", 90, 900);
        ship3 = new StarShip("Apollo", 80, 800);
        ship4 = new StarShip("Mars", 110, 1100);
        ship5 = new StarShip("Poseidon", 100, 1000);
        ship6 = new StarShip("Hermes", 90, 900);
        
        group1 = new BattleGroup(ship1, ship2, ship3);
        group2 = new BattleGroup(ship4, ship5, ship6);
        
        group1.printGroupDetails();
        group2.printGroupDetails();
          
        //Wait for an ENTER to proceed
        System.out.println("Press ENTER to continue...");
        try 
        {
            int key = System.in.read();
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
     }
}



