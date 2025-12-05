class CountofString {
    public static void main(String[] args) {
        String words = "Mother Theresa Institute of Engineering and Technology";
        String[] arr = words.split(" "); 
        int count = 0;
        for(String w : arr){
            count++;
        }
        System.out.println("Number of words: " + count);
    }
}

