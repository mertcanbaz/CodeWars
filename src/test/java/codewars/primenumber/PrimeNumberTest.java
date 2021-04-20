package codewars.primenumber;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void isPrimeTest() {
        PrimeNumber primeNumber = new PrimeNumber();
        boolean testFlag = primeNumber.isPrime(10);
        Assert.assertThat(testFlag, CoreMatchers.is(false));
    }

    @Test
    public void isPrimeTest1() {
        PrimeNumber primeNumber = new PrimeNumber();
        boolean testFlag = primeNumber.isPrime(17);
        Assert.assertThat(testFlag, CoreMatchers.is(true));
    }

    @Test
    public void isPrimeTest3() {
        PrimeNumber primeNumber = new PrimeNumber();
        boolean testFlag = primeNumber.isPrime(11);
        Assert.assertThat(testFlag, CoreMatchers.is(true));
    }

    @Test
    public void isPrimeTest4() {
        PrimeNumber primeNumber = new PrimeNumber();
        boolean testFlag = primeNumber.isPrime(18);
        Assert.assertThat(testFlag, CoreMatchers.is(false));
    }


}