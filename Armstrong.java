import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
        int n=s.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig*dig*dig;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }       
        }
    }   
}
           