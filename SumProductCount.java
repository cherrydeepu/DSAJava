class SumProductCount{
    public static void main(String args[]){
        int num=456789;
        int sum=0;
        int product=1;
        int count=0;
        int rev=0;
        while(num!=0){
            int ld=num%10;
            sum=sum+ld;
            product=product*ld;
            count++;
            rev=rev*10+ld;
            num=num/10;
        }
        System.out.println("sum="+sum);
        System.out.println("product="+product);
        System.out.println("count="+count);
        System.out.println("reverse="+rev);  
    }
}
