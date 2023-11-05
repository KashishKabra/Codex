public class Worker {
    String name;
    double basic;
    Worker(String n, int b){
        this.name=n;
        this.basic=b;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Basic pay:"+basic);
    }
}
class Wages extends Worker{
    int hrs;
    int rate;
    double wage;
    public Wages(String n, int b,int h,int w,int r){
        super(n,b);
        this.hrs=h;
        this.wage=w;
        this.rate=r;
    }
    public double overtime(){
        return hrs*rate;
    }
    public void display(){
        wage=overtime()+basic;
        super.display();
        System.out.println("Hours:"+hrs);
        System.out.println("Rate:"+rate);
        System.out.println("Wage:"+wage);
    }
}