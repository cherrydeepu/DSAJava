public class FrequencyCharacter1 {
    public static void main(String args[]){
        String str="narayana";
        boolean[] seen = new boolean[str.length()]; 
         for(int i=0;i<str.length();i++){
            if(!seen[i]){
                int count=0;
                for(int j=1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        seen[j]=true;
                        count++;
                    }
                }
                System.out.println(str.charAt(i)+" = "+count);
            }
        }
    }
}

