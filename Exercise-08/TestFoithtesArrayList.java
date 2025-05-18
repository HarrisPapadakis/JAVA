import java.util.*;

public class TestFoithtesArrayList
{
   public static void main(String args[])
   {
       ArrayList samos2004 = new ArrayList(3);
       ArrayList samos2005 = new ArrayList();
       samos2004.add(new Foithths("Νίκος", "Νικολάου", 7.5, 18));
       samos2004.add(new Foithths("?ηµήτρης", "?ηµητρίου", 5.75, 19));
       samos2004.add(new Foithths("Γιώργος", "Γεωργίου", 8.8, 20));
       samos2004.add(new Foithths("Κώστας", "Κωνσταντίνου", 6.75, 21));
       samos2004.add(new Foithths("Αλεξανδρος", "Αλεξάνδρου", 7.1, 19));
       samos2004.add(new Foithths("Διονύσης", "Διονυσίου", 8.3, 20));
       for (int i=0; i<5; i++)
          samos2005.add(null);
       Collections.fill(samos2005, new Foithths("Ανδρέας", "Ανδρέου", 8.25, 22));
       Collections.fill(samos2005, new Foithths("Μιχάλης", "Μιχαήλ", 5.8, 21));
       System.out.println(samos2004);
       System.out.println(samos2005);
       for (int i=0; i<samos2004.size(); i++)
          ((Foithths)samos2004.get(i)).print();
       for (int i=0; i<samos2005.size(); i++)
          ((Foithths)samos2005.get(i)).print();
   } // main
} // TestFoithtesArrayList