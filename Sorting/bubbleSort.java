import java.io.*;

class bubbleSort 
{

    public static void bubleSort(int arr[]) {
        int n = arr.length;

        for (int i=n-1; i>=0; i--) {
            for ( int j = 0; j<n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }


    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array");
        printArray(numbers);

        bubleSort(numbers);

        System.out.println("Sorted Array");
        printArray(numbers);


    }

}