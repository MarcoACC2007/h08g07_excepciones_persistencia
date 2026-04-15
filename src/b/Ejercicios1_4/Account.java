package b.Ejercicios1_4;

public class Account {

    //Variables:
    private int id;
    private Customer customer;
    private double balance = 0.0;

    //Constructores:
    public Account(int i, Customer c, double b) {
        this.id = i;
        this.customer = c;
        this.balance = b;
    }

    public Account(int i, Customer c) {
        this.id = i;
        this.customer = c;
    }

    //Getters:
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    //Setters:
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    //Otros métodos:
    public Account deposit (double amount) {
        balance = balance + amount;
        return this;
    }

    public Account withdraw (double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println("amount withdrew exceeds the current balance!");
        }
        return this;
    }

    //ToString:
    public String toString() {
        return customer +" balance = $ " + String.format("%.2f",balance);
    }
}
