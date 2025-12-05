class PrimenumRnot {
    public static void main(String[] args) {
        int num=45;
        int count=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
                System.out.println(count);
            }
        } 
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
