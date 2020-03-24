package com.company;
public class PrinterScreen {
    private int cols_per_page;
    private int rows_per_page;

    public PrinterScreen(int cols_per_page, int rows_per_page) {
        this.cols_per_page = cols_per_page;
        this.rows_per_page = rows_per_page;
    }

    public void print_screen(int numbersArray[], int numbers_to_print) {
        int pagenumber = 1;
        int pageoffset = 1;
        while (pageoffset <= numbers_to_print) {
            System.out.print("The First ");
            System.out.print(Integer.toString(numbers_to_print));
            System.out.print(" Prime Numbers === Page ");
            System.out.print(Integer.toString(pagenumber));
            System.out.println("\n");
            for (int rowoffset = pageoffset; rowoffset <= pageoffset + rows_per_page - 1; rowoffset++) {
                for (int col = 0; col <= (cols_per_page - 1); col++)
                    if (rowoffset + col * rows_per_page <= numbers_to_print)
                        System.out.printf("%10d", numbersArray[rowoffset + col * rows_per_page]);
                System.out.println();
            }
            System.out.println("\f");
            pagenumber++;
            pageoffset += rows_per_page * cols_per_page;
        }
    }
}
