package algos;

import java.util.Random;

public class QuickSortAlgo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("before sorting");
        printArray(arr);

        quickSort(arr, 0, arr.length-1);

        System.out.println("after sorting");
        printArray(arr);

    }

    private static void quickSort(int[] arr, int lowIndex, int HighIndex) {
        if(lowIndex>=HighIndex){
            return;
        }
        int pivot = arr[HighIndex];
        int leftPointer = lowIndex;
        int rightPointer = HighIndex;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr,leftPointer,rightPointer);
        }

        swap(arr, leftPointer, HighIndex);
        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr,leftPointer+1,HighIndex);

        
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;

        
    }

    private static void printArray(int[] arr) {
        

        for (int i = 0; i < arr.length; i++) {
            System.out.println("the elements in array are :- " + " " + arr[i]);
        }
        
    }
}
