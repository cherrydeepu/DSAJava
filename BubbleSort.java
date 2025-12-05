public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        int[] arr = {3, 6, 7, 9, 5, 8, 0, 1, 2, 4};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
