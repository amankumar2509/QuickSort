/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar (amankumar_2509)
 *   Date: 01-05-2021
 *   Time: 12:17
 *   File: QuickSortAlgo.java
 */


public class QuickSortAlgo {
    /**
     * this method is used to perform swapping in the quicksort algorithm
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    /**
     * this method is used to get the partition in quicksort algorithm
     * @param array
     * @param lowerBound
     * @param upperBound
     * @return
     */
    public static int getPivot(int[] array,int lowerBound,int upperBound){
        int pivot=array[upperBound];
        int i=lowerBound-1;
        for (int j = lowerBound; j <=upperBound-1 ; j++) {
            if (array[j]<pivot){
                i++;
                swap(array,i,j);
            }

        }
        swap(array,i+1,upperBound);
        return (i+1);
    }

    /**
     * this method used to perform quicksort operation
     * @param array
     * @param start
     * @param end
     */
    public void quickSort(int array[],int start,int end){
        if (start<end){
            int pi=getPivot(array,start,end);
            quickSort(array,start,pi-1);
            quickSort(array,pi+1,end);
        }
    }

    /**
     * this method is used to print the array
     * @param array
     * @param size
     */
    public void printArray(int[] array,int size){
        for (int i = 0; i <size ; i++)
            System.out.println(array[i]+" ");
            System.out.println();

    }
}
