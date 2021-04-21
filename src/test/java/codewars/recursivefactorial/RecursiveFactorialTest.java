package codewars.recursivefactorial;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveFactorialTest {

    @Test
    public void squareDigits() {
        RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
        long testResult = recursiveFactorial.factorial(5L);
        Assert.assertThat(testResult, CoreMatchers.is(120L));
    }

    @Test
    public void squareDigits1() {
        RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
        long testResult = recursiveFactorial.factorial(4L);
        Assert.assertThat(testResult, CoreMatchers.is(24L));
    }
}