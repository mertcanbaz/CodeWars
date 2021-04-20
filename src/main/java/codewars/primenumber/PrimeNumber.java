package codewars.primenumber;

import java.util.stream.IntStream;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    public static void printNumber(int a) {
        System.out.println(isPrime(a) ? String.format("%s is a prime number", a) : String.format("%s is not a prime number", a));
    }

    public void main(String[] args) {
        //This application is expected to determine the prime numbers between the range.
        IntStream.rangeClosed(1, 10).forEach(PrimeNumber::printNumber);
    }

}
