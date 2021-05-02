/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar (amankumar_2509)
 *   Date: 01-05-2021
 *   Time: 12:37
 *   File: Main.java
 */


public class Main {
    public static void main(String[] args) {
        int[] array={10,7,8,9,1,5};
        int n=array.length;
        QuickSortAlgo sort=new QuickSortAlgo();
        sort.quickSort(array,0,n-1);
        System.out.println("sorted array");
        sort.printArray(array,n);
    }
}
