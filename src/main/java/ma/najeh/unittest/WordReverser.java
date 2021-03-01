package ma.najeh.unittest;

public class WordReverser {

    public String reverse(String word) {
        if (word == null) {
            throw new UnsupportedWordException("Null is not supported as word.");
        }
        if (word.contains(" ")) {
            throw new UnsupportedWordException("The word '" + word + "' is not supported.");
        }

        return new StringBuilder(word).reverse().toString().toLowerCase();
    }
}
