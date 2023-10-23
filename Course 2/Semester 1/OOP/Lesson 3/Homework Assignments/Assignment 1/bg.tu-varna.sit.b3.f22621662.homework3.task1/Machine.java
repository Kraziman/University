public class Machine {
    private double price;

    public Machine() {
    }

    public Machine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Printer extends Machine {
    private int numOfPages;
    public Printer(double price, int numOfPages) {
        super(price);
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}

