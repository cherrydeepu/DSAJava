public class CountofString1 {
    public static void main(String args[]){
        String str = "Welcome to my java class";
        int count = 1;  
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){ //or if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                count++;  
            }
        }
        System.out.println("Number of words: " + count);
    }
}

