class CountofString2{
    public static void main(String[] args) {
        String str = "     i love india.  ";
        int count=0;
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {  
                count++;
                result = result + str.charAt(i); 
            }
        }
        System.out.println("Number of spaces:"+count);
        System.out.println(result);
    }
}
