package com.meddows;

public class Printer {
    private int tonerLever;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLever, boolean duplex) {
        if (tonerLever > -1 && tonerLever <= 100) {
            this.tonerLever = tonerLever;
        } else {
            this.tonerLever = -1;
        }
        this.tonerLever = tonerLever;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerLever > 0 && tonerAmount <= 100){
            if(this.tonerLever + tonerAmount > 100){
                return -1;
            }
            this.tonerLever += tonerAmount;
            return this.tonerLever;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
