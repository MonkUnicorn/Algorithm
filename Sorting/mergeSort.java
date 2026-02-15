public class mergeSort {

    public static void Divide(int arr[], int l, int r) {
        if(l < r) {
            int m = (l+r)/2;
            Divide(arr, l, m);
            Divide(arr, m+1, r);
            Merge(arr, l, m, r);
        }
    }
    
    public static void Merge(int arr[], int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i<n1; i++) {
            L[i] = arr[l+i];
        }

        for(int j = 0; j<n2; j++) {
            R[j] = arr[m+1+j];
        }

        int i=0, j=0, k=l;

        while(i<n1 && j<n2) {

            if(L[i]<R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            }
            else {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<n1) {
           arr[k] = L[i];
           i++;
           k++; 
        }

        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int arr[]) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int numbers[] = {63, 42, 86, 15, 67, 24, 51, 92};
        System.out.println("Original Array");
        printArray(numbers);

        Divide(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array");
        printArray(numbers);
    }
}
