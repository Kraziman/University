public class Ticket {
    private String performanceName;
    private double price;

    public Ticket(String performanceName, double price) {
        this.performanceName = performanceName;
        this.price = price;
    }

    protected double getPrice(){
        return price;
    }

    protected void setPrice(double price){
        this.price = price;
    }
}

class StandardTicket extends Ticket {
    private boolean used;

    public StandardTicket(String performanceName, double price) {
        super(performanceName, price);
        this.used = false;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}

class DiscountedTicket extends StandardTicket {
    private String nameOfUser;

    public DiscountedTicket(String performanceName, double price, String nameOfUser) {
        super(performanceName, price * 0.5);
        this.nameOfUser = nameOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }
}

class GroupTicket extends Ticket {
    private int numberOfUsers;

    public GroupTicket(String performanceName, double price, int numberOfUsers) {
        super(performanceName, price * numberOfUsers);
        this.numberOfUsers = numberOfUsers;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void addUser() {
        if (numberOfUsers < 20) {
            numberOfUsers++;
            setPrice(getPrice() - 2);
        }
    }
}
