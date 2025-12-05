class FrequencyCharacter{
    public static void main(String[] args) {
        String s = "narayana";
        for(int i = 0; i < s.length(); i++) {
            if(i == s.indexOf(s.charAt(i))) {
                int count = 0;
                for(int j = 0; j < s.length(); j++) {
                    if(s.charAt(i) == s.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(s.charAt(i) + " = " + count);
            }
        }
    }
}
