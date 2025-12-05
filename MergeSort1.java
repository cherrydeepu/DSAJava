public class MergeSort1 {
    public static void mergesort(int arr,int l, int r){
        if(l<r){
            int m=l+(r-1)/2;
            mergesort(arr, l, m);
            mergesort(arr, m+1, r);
            mergesort()
        }
    }
    public static void main (String args[]){
        int arr[]={12,11,13,5,6,7};
        mergesort(arr,0,arr.length);
    }
     
}
