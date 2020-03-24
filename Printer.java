package com.company;
public class Printer {
    public static final int number_primes = 1000;
    public static final int cols_per_page = 4;
    public static final int rows_per_page = 50;

    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        PrinterScreen printerScreenOBJ = new PrinterScreen(cols_per_page,rows_per_page);
        int primes[] = primeGenerator.createPrimeArray(number_primes);
        printerScreenOBJ.print_screen(primes, number_primes);
    }
}

