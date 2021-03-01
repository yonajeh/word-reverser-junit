package ma.najeh.unittest;

import org.junit.Assert;
import org.junit.Test;

public class WordReverserTest {

    @Test
    public void test_reverse_normal_word_and_get_the_inverse() {
        WordReverser wordReverser = new WordReverser();

        String ret = wordReverser.reverse("bla");

        Assert.assertEquals("alb", ret);
    }

    @Test
    public void test_reverse_normal_word_with_upper_case_and_get_the_inverse() {
        WordReverser wordReverser = new WordReverser();

        String ret = wordReverser.reverse("BLa");

        Assert.assertEquals("alb", ret);
    }

    @Test(expected = UnsupportedWordException.class)
    public void test_reverse_null_as_word_and_throw_exception() {
        WordReverser wordReverser = new WordReverser();

        wordReverser.reverse(null);

    }

    @Test(expected = UnsupportedWordException.class)
    public void test_reverse_2_words_as_word_and_throw_exception() {
        WordReverser wordReverser = new WordReverser();

        wordReverser.reverse("bla bla");

    }

}
