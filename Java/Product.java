public class Product {
    String name;
    int code;
    double amount;
    Product(String n, int c, double p){
        this.name=n;
        this.code=c;
        this.amount=p;
    }
    public void show(){
        System.out.println("NAME:"+name);
        System.out.println("Code:"+code);
        System.out.println("Amount:"+amount);
    }

}
class Sales extends Product{
    int days;
    double tax;
    double totamt;

    Sales(String n, int c,double p,int d, double t,double ta){
        super(n,c,p);
        this.tax=t;
        this.totamt=ta;
        this.days=d;
    }
    public void compute(){
        double serviceTax=(0.124)*amount;
        double fine=0;
        if(days>30){
            fine=(0.025)*amount;
        }
        totamt=serviceTax+fine+amount;
    }
    public void show(){
        super.show();
        System.out.println("Number of Days Taken to Pay: " + days);
        System.out.println("Service Tax: " + tax);
        System.out.println("Total Amount Paid by Retailer: " + totamt);
    }
}
