package sorts.selectSort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        if(arr==null || arr.length<2){
            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
//                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            swap(arr,i,minIndex);

        }
    }

    public  void selectSort00(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);

        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }



}
