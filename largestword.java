class largestword{
    public static void main(String[] args) {
        String str = "Welcome to my java programming class";
        String[] words = str.split(" ");
        String largest = "";
        for(String w : words) {
            if(w.length() > largest.length()) {
                largest = w;
            }
        }
        System.out.println(largest);
    }
}
