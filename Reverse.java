class Reverse{
    public static void main(String args[]){
        int n=123;
        int rev=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println(rev);  
    }
}