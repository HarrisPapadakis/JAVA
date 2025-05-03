import java.io.IOException;

public class TestSortingAlgorithms 
{
    public static void main(String args[]) 
    {
        int vector1[] = new int[8];
        int replica1[] = new int[8];
        int vector2[] = new int[16];
        int replica2[] = new int[16];
        int vector3[] = new int[32];
        int replica3[] = new int[32];

        SortingAlgorithms.initializeVector(vector1);
        SortingAlgorithms.initializeVector(vector2);
        SortingAlgorithms.initializeVector(vector3);

        replica1 = SortingAlgorithms.replicate(vector1);
        replica2 = SortingAlgorithms.replicate(vector2);
        replica3 = SortingAlgorithms.replicate(vector3);

        System.out.println("\n*************************************************");
        System.out.println("\n------------------ TESTING 2 Sorting Algorithms ------------------");
        System.out.println("\nΤο τυχαίο μη ταξινομημένο διάνυσμα vector1 αρχικά είναι:");
        SortingAlgorithms.printVector(vector1); 
        SortingAlgorithms.mergeSort(vector1, vector1.length);
        SortingAlgorithms.quickSort(replica1, 0, replica1.length - 1);

        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο MergeSort, "
                        +"προκύπτει το νέο διάνυσμα vector1:");
        SortingAlgorithms.printVector(vector1);
        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο QuickSort, "
                        +"προκύπτει το νέο διάνυσμα replica1:");
        SortingAlgorithms.printVector(replica1);
        System.out.println("\n\n------------------------------------------------------------------");

        System.out.println("\n\nΤο τυχαίο μη ταξινομημένο διάνυσμα vector2 αρχικά είναι:");
        SortingAlgorithms.printVector(vector2);
        SortingAlgorithms.mergeSort(vector2, vector2.length);
        SortingAlgorithms.quickSort(replica2, 0, replica2.length - 1);

        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο MergeSort, "
                        +"προκύπτει το νέο διάνυσμα vector2:");
        SortingAlgorithms.printVector(vector2);
        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο QuickSort, " 
                        +"προκύπτει το νέο διάνυσμα replica2:");
        SortingAlgorithms.printVector(replica2);
        System.out.println("\n\n--------------------+ ---------------------------------------------");

        System.out.println("\n\nΤο τυχαίο μη ταξινομημένο διάνυσμα vector3 αρχικά είναι:");
        SortingAlgorithms.printVector(vector3);
        SortingAlgorithms.mergeSort(vector3, vector3.length);
        SortingAlgorithms.quickSort(replica3, 0, replica3.length - 1);

        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο MergeSort, "
                        +"προκύπτει το νέο διάνυσμα vector3:");
        SortingAlgorithms.printVector(vector3);
        System.out.println("\n\nΜετά την ταξινόμηση με τον αλγόριθμο QuickSort, "
                        +"προκύπτει το νέο διάνυσμα replica3:");
        SortingAlgorithms.printVector(replica3);
        

        // Pause before exit
        try 
        {
            int key = System.in.read();
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    } // main
} // TestSortingAlgorithms

