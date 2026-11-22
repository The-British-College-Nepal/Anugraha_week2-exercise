package counter;

public class WordProcessor implements Counter {

    @Override
    public int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }

    @Override
    public int countLetters(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int letterCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letterCount++;
            }
        }
        return letterCount;
    }

    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            return 0;
        }
        return sentence.length();
    }
}