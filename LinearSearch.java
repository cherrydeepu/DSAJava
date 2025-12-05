public class LinearSearch {
    public static void main(String args[]){
        String str = "NARAYANA";
        System.out.println(linearSearch(str));
    }
    public static String linearSearch(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'A' || ch == 'a'){
                result = result + "*";   
            } else {
                result = result + ch;   
            }
        }
        return result;
    }
}
