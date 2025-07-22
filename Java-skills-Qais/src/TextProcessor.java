public class TextProcessor {

    public static int countWords(String sentence) {
        String[] seperated;
        if (sentence.trim().length() == 0) {
            System.out.println("String is empty");
            return 0;
        } else {
            seperated = sentence.trim().split(" +");
            return seperated.length;
        }
    }

    public static String replaceWord(String text, String oldWord, String newWord){
        String[] seperated;
        seperated = text.trim().split(" +");
        for (int i = 0; i < seperated.length; i++) {
            if (seperated[i].equals(oldWord)) {
                seperated[i] = newWord;
            }
        }
        return String.join(" ", seperated);
    }
}

