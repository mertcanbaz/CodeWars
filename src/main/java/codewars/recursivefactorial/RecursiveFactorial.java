package codewars.recursivefactorial;

public class RecursiveFactorial {
    long factorial(long i) {
        if(i <= 1)
            return 1;
        else
            return i * factorial(i-1);
    }
}
