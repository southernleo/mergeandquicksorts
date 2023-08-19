package algohw1;

import java.util.Random;
import java.util.Stack;

public class Sort {
	// This method sorts an integer array using Merge Sort algorithm based on the number of partitions specified
	// If number of partitions is "TwoParts", then the array will be divided into two parts recursively until it reaches base case
	// If number of partitions is "ThreeParts", then the array will be divided into three parts recursively until it reaches base case
    public void mergeSort(int[] arrayToSort, String numberOfPartitions) {
        if (numberOfPartitions.equals("TwoParts")) {
            mergeSortTwoParts(arrayToSort, 0, arrayToSort.length-1);
        } else if (numberOfPartitions.equals("ThreeParts")) {
            mergeSortThreeParts(arrayToSort, 0, arrayToSort.length-1);
        } else {
            throw new IllegalArgumentException("Invalid number of partitions.");
        }
    }
    
 // This method recursively sorts the left and right parts of the array using Merge Sort algorithm
 // until it reaches the base case (i.e., left index is greater than or equal to right index)
 // Then, it merges the two sorted parts using the merge() method
    
    private void mergeSortTwoParts(int[] arrayToSort, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortTwoParts(arrayToSort, left, mid);
            mergeSortTwoParts(arrayToSort, mid+1, right);
            merge(arrayToSort, left, mid, right);
        }
    }
 // This method recursively sorts the three parts of the array using Merge Sort algorithm
 // until it reaches the base case (i.e., left index is greater than or equal to right index)
 // Then, it merges the three sorted parts using the merge() method
    private void mergeSortThreeParts(int[] arrayToSort, int left, int right) {
        if (left < right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = left + 2 * (right - left) / 3;
            mergeSortThreeParts(arrayToSort, left, mid1);
            mergeSortThreeParts(arrayToSort, mid1+1, mid2);
            mergeSortThreeParts(arrayToSort, mid2+1, right);
            merge(arrayToSort, left, mid1, mid2);
            merge(arrayToSort, mid1+1, mid2, right);
        }
    }
 // This method merges two sorted parts of the array into a single sorted part
 // It creates a temporary array of size (right - left + 1) to store the merged result
 // Then, it compares the elements of the two parts and copies them into the temporary array in sorted order
 // Finally, it copies the elements of the temporary array back to the original array
    private void merge(int[] arrayToSort, int left, int mid, int right) {
        int[] tempArray = new int[right - left + 1];
        int i = left, j = mid+1, k = 0;
        while (i <= mid && j <= right) {
            if (arrayToSort[i] <= arrayToSort[j]) {
                tempArray[k++] = arrayToSort[i++];
            } else {
                tempArray[k++] = arrayToSort[j++];
            }
        }
        while (i <= mid) {
            tempArray[k++] = arrayToSort[i++];
        }
        while (j <= right) {
            tempArray[k++] = arrayToSort[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            arrayToSort[i] = tempArray[k];
        }
    }
    
    public static void quickSort(int[] arr, String pivotType) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        switch (pivotType) {
            case "FirstElement":
                break;
            case "RandomElement":
                int randomIndex = new Random().nextInt(right - left + 1) + left;
                swap(arr, left, randomIndex);
                break;
            case "MidOfFirstMidLastElement":
                int midIndex = (left + right) / 2;
                if ((arr[midIndex] <= arr[left] && arr[left] <= arr[right])
                        || (arr[right] <= arr[left] && arr[left] <= arr[midIndex])) {
                    swap(arr, left, left);
                } else if ((arr[left] <= arr[midIndex] && arr[midIndex] <= arr[right])
                        || (arr[right] <= arr[midIndex] && arr[midIndex] <= arr[left])) {
                    swap(arr, left, midIndex);
                } else {
                    swap(arr, left, right);
                }
                break;
            default:
                break;
        }
        int pivotIndex = partition(arr, left, right);
        try {
            quickSort(arr, pivotType, left, pivotIndex - 1);
            quickSort(arr, pivotType, pivotIndex + 1, right);
        } catch (StackOverflowError ex) {
            System.gc();
        }
    }

    private static void quickSort(int[] arr, String pivotType, int left, int right) {
        if (left >= right) {
            return;
        }
        switch (pivotType) {
            case "FirstElement":
                break;
            case "RandomElement":
                int randomIndex = new Random().nextInt(right - left + 1) + left;
                swap(arr, left, randomIndex);
                break;
            case "MidOfFirstMidLastElement":
                int midIndex = (left + right) / 2;
                if ((arr[midIndex] <= arr[left] && arr[left] <= arr[right])
                        || (arr[right] <= arr[left] && arr[left] <= arr[midIndex])) {
                    swap(arr, left, left);
                } else if ((arr[left] <= arr[midIndex] && arr[midIndex] <= arr[right])
                        || (arr[right] <= arr[midIndex] && arr[midIndex] <= arr[left])) {
                    swap(arr, left, midIndex);
                } else {
                    swap(arr, left, right);
                }
                break;
            default:
                break;
        }
        int pivotIndex = partition(arr, left, right);
        try {
            quickSort(arr, pivotType, left, pivotIndex - 1);
            quickSort(arr, pivotType, pivotIndex + 1, right);
        } catch (StackOverflowError ex) {
            System.gc();
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotValue = arr[left];
        int i = left + 1;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < pivotValue) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, left, i - 1);
        return i - 1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


        
        
    }


    
    
    
    
  

 