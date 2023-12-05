package overLoaded.packageDemo;

public class Retail {


    static String manager;
    String location;
    private int sales, expenses, staff, margin;


public Retail(){

}
public Retail(String manager, int staff){
    this.manager =manager;
    this.staff = staff;

}

    public Retail(String manager, String location, int sales, int expenses){
        Retail.manager = manager;
        this.location = location;
        this.sales= sales;
        this.expenses = expenses;

    }
    public Retail(String manager){
        Retail.manager = manager;
    }


    public void setStaff(int staff, String manager)
    {this.staff= staff;
    System.out.printf("\n%s has %d staff members", manager, staff);}

    public int getStaff() {
        return staff;
    }
    public void setSales(int sales){this.sales= sales;}

        public int getSales(){
            return sales;
    }
    public void setMargin(int margin){this.margin= sales-expenses;}

    public int getMargin(){
        return margin;}
    public void setExpenses(int expenses){this.expenses= expenses;}

    public int getExpenses(){
        return expenses;}

    private void getStoreInfo(){
        System.out.printf("\nStore: %s \nManager: $s \nStaff Members: %d\nMargin: %d$", location, manager, staff, margin);
    }

    public static void setManager(String manager) {
        Retail.manager = manager;
    }

    public static String getManager(){
        return manager;
    }
    protected void getProfit(){
        System.out.printf("Profit: %d $", margin);
    }
}


