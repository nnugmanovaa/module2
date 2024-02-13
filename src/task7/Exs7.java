package task7;

public class Exs7 {
    public static void main(String[] args) {
        String[] word1 =new String[]{ "ab", "c"};
        String[] word2= new String[]{"a", "bc"};
        StringBuilder fullSentenceFromWord1 = new StringBuilder();
        StringBuilder fullSentenceFromWord2 = new StringBuilder();
        for (int i =0; i<  word1.length; i++){
            fullSentenceFromWord1.append(word1[i]);
        }
        for (int i =0; i<  word2.length; i++){
            fullSentenceFromWord2.append(word2[i]);
        }
        if(fullSentenceFromWord1.toString().equals(fullSentenceFromWord2.toString())){
            System.out.println(true);
        } else System.out.println(false);
    }
}
