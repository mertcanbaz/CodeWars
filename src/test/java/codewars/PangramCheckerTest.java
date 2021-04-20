package codewars;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PangramCheckerTest {

    @Test
    public void testCheck() {
        PangramChecker pangramChecker = new PangramChecker();
        boolean testFlag = pangramChecker.check("The quick brown fox jumps over the lazy dog.");
        Assert.assertThat(testFlag, CoreMatchers.is(true));
    }

    @Test
    public void testCheckSecondSentence() {
        PangramChecker pangramChecker = new PangramChecker();
        boolean testFlag = pangramChecker.check("You shall not pass!");
        Assert.assertThat(testFlag, CoreMatchers.is(false));
    }

    @Test
    public void testCheck1() {
        PangramChecker pangramChecker = new PangramChecker();
        boolean testFlag = pangramChecker.check1("You shall not pass!");
        Assert.assertThat(testFlag, CoreMatchers.is(false));
    }

    @Test
    public void testCheck1SecondSentence() {
        PangramChecker pangramChecker = new PangramChecker();
        boolean testFlag = pangramChecker.check1("You shall not pass!");
        Assert.assertThat(testFlag, CoreMatchers.is(false));
    }

}