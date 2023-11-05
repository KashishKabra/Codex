public class Stock {
    String item;
    int qt;
    double rate;
    double amt;

    public Stock(String item, int qt, double rate) {
        this.item = item;
        this.qt = qt;
        this.rate = rate;
        this.amt = qt * rate;
    }

    public void display() {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qt);
        System.out.println("Unit Price: " + rate);
        System.out.println("Net Value: " + amt);
    }
}

class Purchase extends Stock {
    int pqty;
    double prate;

    public Purchase(String item, int qt, double rate, int pqty, double prate) {
        super(item, qt, rate);
        this.pqty = pqty;
        this.prate = prate;
    }

    public void update() {
        qt += pqty;
        if (prate != rate) {
            rate = prate;
        }
        amt = qt * rate;
    }
    public void display() {
        super.display();
        System.out.println("Purchased Quantity: " + pqty);
        System.out.println("Purchase Rate: " + prate);
    }
}

