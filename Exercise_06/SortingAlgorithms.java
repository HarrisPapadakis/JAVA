import java.util.Random;

public class SortingAlgorithms
{
    private static  Random random = new Random();
    
    public static void prinVector (int vector[])
    {
      for(int i=0;  i < vector.length  ; i++)
          System.out.print(vector[i] + "\t");  
    }
    
    public static void initializeVector(int vector[])
    {
        for(int i=0; i < vector.length; i++)
            vector[i] = random.nextInt(100);
    }
    
    public static int[] replicate(int vector[])
{
    int copyofVector[] = new int[vector.length];

    
    for(int i = 0; i < vector.length; i++)
        copyofVector[i] = vector[i];

    return copyofVector;
}

    
    //MERGESORT
    public static void mergeSort(int[] a, int n)
    {
        if(n<2)
            return;
            
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        
        for(int i = 0; i < mid; i++)
            l[i] = a[i];
            
        for(int i = mid; i < n; i++)
            r[i-mid] = a[i];
            
        mergeSort(l, mid);
        mergeSort(r, n-mid);
        
        merge(a, l, r, mid, n-mid);
    }
    
    public static void merge(int[] a, int[] l, int[] r, int left, int right)
    {
        int i=0, j=0, k=0;
        
        while(i < left && j < right)
        {
            if(l[i]<=r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        
        while(i < left )
            a[k++] = l[i++];
            
        while(j < right)
            a[k++] = r[j++];
    }
    
    
//QUICKSORT
public static void quickSort(int vector[], int begin, int end)
{
    if(begin < end)
    {
        int  partitionIndex = partition(vector, begin, end);
        
        quickSort(vector, begin, partitionIndex - 1);
        quickSort(vector, partitionIndex + 1, end);
    }
}

private static int partition(int vector[], int begin, int end)
{
    int pivot = vector[end], i = begin-1;
    for(int j = begin; j < end; j++)
    {
        if (vector[j] <= pivot)
        {
            i++;
            
            int swapTemp = vector[i];
            vector [i] = vector[j];
            vector [j] = swapTemp;
        }
    }
    int swapTemp = vector[i+1];
        vector[i+1] = vector[end];
        vector[end] = swapTemp;
        return i+1;
    }  
}


