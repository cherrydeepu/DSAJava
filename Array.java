class Array{
    public static void main(String[] args) {
        int a[]={0,1,2,3,4,5,6,7,8,9};
        int target=5;
        System.out.println(value(a,target));
    }
    public static boolean value(int[]a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return true;
            }
        }
        return false;
    }
}