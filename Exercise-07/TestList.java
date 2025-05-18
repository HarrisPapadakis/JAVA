public class TestList
{
   public static void main(String args[])
   {
       Foithths foit1 = new Foithths("Νίκος", "Νικολάου", 7.34, 20);
       Foithths foit2 = new Foithths("Δηµήτρης", "Δηµητρίου", 5.99, 21);
       Foithths foit3 = new Foithths("Γιώργος", "Γεωργίου", 7.79, 19);
       Foithths foit4 = new Foithths("Κώστας", "Κωνσταντίνου", 8.75, 22);
       Foithths foit5 = new Foithths("Ανδρέας", "Ανδρέου", 6.35, 21);
       Foithths foit6 = new Foithths("Κώστας", "Γεωργίου", 5.75, 20);
       Node node1 = new Node(foit1);
       Node node2 = new Node(foit2);
       Node node3 = new Node(foit3);
       Node node4 = new Node(foit4);
       Node node5 = new Node(foit5);
       Node node6 = new Node(foit6);
       Node node7 = new Node(foit1);
       Node node8 = new Node(foit2);
       Node node9 = new Node(foit3);
       Node node10 = new Node(foit4);
       Node node11 = new Node(foit5);
       Node node12 = new Node(foit6);
       Node node13 = new Node(foit1);
       Node node14 = new Node(foit2);
       Node node15 = new Node(foit3);
       Node node16 = new Node(foit4);
       Node node17 = new Node(foit5);
       Node node18 = new Node(foit6);
       FoithtesList samos2004 = new FoithtesList();
       FoithtesList samos2004_2 = new FoithtesList();
       FoithtesList samos2004_3 = new FoithtesList();
       samos2004.insert(node1);
       samos2004.insert(node2);
       samos2004.insert(node3);
       samos2004.insert(node4);
       samos2004.insert(node5);
       samos2004.insert(node6);
       samos2004_2.insertAverage(node7);
       samos2004_2.insertAverage(node8);
       samos2004_2.insertAverage(node9);
       samos2004_2.insertAverage(node10);
       samos2004_2.insertAverage(node11);
       samos2004_2.insertAverage(node12);
       samos2004_3.insertAlphabetical(node13);
       samos2004_3.insertAlphabetical(node14);
       samos2004_3.insertAlphabetical(node15);
       samos2004_3.insertAlphabetical(node16);
       samos2004_3.insertAlphabetical(node17);
       samos2004_3.insertAlphabetical(node18);
       System.out.println("\n Η λίστα όταν η εισαγωγή κάθε νέου κόµβου γίνεται στην κεφαλή είναι:");
       samos2004.print();
       System.out.println("\n Η λίστα όταν η εισαγωγή κάθε νέου κόµβου γίνεται µε αύξοντα µέσο όρο είναι: ");
       samos2004_2.print();
       System.out.println("\n Η λίστα όταν η εισαγωγή κάθε νέου κόµβου γίνεται αλφαβητικά είναι: ");
       samos2004_3.print();
   } // main
} // TestList
