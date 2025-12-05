
//int arr[] = {19,10,12,6,4,3,9,4,5,3};
//output : 3 5 9 12 19 
public class ArrayMethod1 {
    public static void main(String[] args) {
        int arr[] = {19,10,12,6,4,3,9,4,5,3};
        int max = -1;
        int n=arr.length;
        int leaders[] = new int[n];
        int k = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                leaders[k++] = max;
            }
        }
        for(int i = 0; i < k; i++) {
            System.out.print(leaders[i]+" ");
        }
    }
}

