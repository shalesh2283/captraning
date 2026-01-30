public class LinearSearchWord {
    public static String searchWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is great",
                "I love programming",
                "Data structures are fun"
        };
        String word = "programming";
        System.out.println("Sentence containing the word: " + searchWord(sentences, word));
    }
}
