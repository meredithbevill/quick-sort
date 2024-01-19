public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);


            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];


        int i = low - 1;


        for (int j = low; j < high; j++) {
            
            if (arr[j] <= pivot) {
                i++;

              
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        // Replace this array with your own data
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        // Apply Quick Sort
        quickSort(myArray, 0, myArray.length - 1);

        System.out.print("\nSorted Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
