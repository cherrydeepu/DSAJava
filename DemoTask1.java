public class DemoTask1 {
    public static void selection(int [] arr){
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                     min=j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int [] arr={9,8,1,2,4,5,7,6};
        selection(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}