package com.company;

public class PrimeGenerator {
    private final int ORDMAX = 30;
    private int[] prime_vect;
    private int candidate;
    private int index_prime;
    private boolean flagPrime;
    private int ord;
    private int square;
    private int n;
    private final int[] multi = new int[ORDMAX + 1];
    public int[] createPrimeArray(int number_primes) {
        prime_vect = new int[number_primes + 1];
        n = 0;
        candidate = 1;
        index_prime = 1;
        prime_vect[1] = 2;
        ord = 2;
        square = 9;
        while (index_prime < number_primes) {
            NextPrime();
            index_prime++;
            prime_vect[index_prime] = candidate;
        }
        return prime_vect;
    }
    private void NextPrime() {
        do {
            candidate += 2;
            if (candidate == square) {
                ord++;
                square = prime_vect[ord] * prime_vect[ord];
                multi[ord - 1] = candidate;
            }
            n = 2;
            flagPrime = true;
            while (n < ord && flagPrime) {
                while (multi[n] < candidate)
                    multi[n] += prime_vect[n] + prime_vect[n];
                if (multi[n] == candidate)
                    flagPrime = false;
                n++;
            }
        } while (!flagPrime);
    }


}
